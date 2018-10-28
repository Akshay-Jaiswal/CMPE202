/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardExp implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String expiryDate = "";
	ICardDecorator decor;


	public void applyDecorator(ICardDecorator w) {
		this.decor = w;
	}

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (expiryDate.equals(""))
		{
			return "[MM/YY]" + "  ";
		}
		else if (decor == null)
		{
			return "[" + expiryDate + "]" + "  ";
		}
		else
		{
			return "[" + decor.decorateCard(expiryDate) + "]" + "  ";
		}
	}

	public void key(String s, int count) 
	{
		if (count >= 17 && count <= 20) 
		{
			if (s.matches("X|x")) 
			{
				if (expiryDate.length() > 0)
				{
					expiryDate = expiryDate.substring(0, expiryDate.length() - 1);
				}
			} else
			{
				expiryDate += s;
			}
		} else if (nextHandler != null)
		{
			nextHandler.key(s, count);
		}
	}

	public void addSubComponent(IDisplayComponent c) {
		return; // do nothing
	}

}