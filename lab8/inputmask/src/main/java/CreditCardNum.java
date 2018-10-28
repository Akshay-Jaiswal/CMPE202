/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardNum implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String number = "";
	ICardDecorator decor;

	public void applyDecorator(ICardDecorator w) {
		this.decor = w;
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (number.equals(""))
		{
			return "[4444 4444 4444 4444]" + "  ";
		}
		else if (decor == null)
		{
			return "[" + number + "]" + "  ";
		}
		else
		{
			return "[" + decor.decorateCard(number) + "]" + "  ";
		}
	}

	public void key(String s, int cnt) 
	{
		if (cnt <= 16) 
		{
			if (s.matches("X|x")) 
			{
				if (number.length() > 0)
				{
					number = number.substring(0, number.length() - 1);
				}
			} else
			{
				number += s;
			}
		} else if (nextHandler != null)
		{
			nextHandler.key(s, cnt);
		}
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}