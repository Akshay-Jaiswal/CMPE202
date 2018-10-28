/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CreditCardCVC implements IDisplayComponent, IKeyEventHandler {

	private IKeyEventHandler nextHandler;
	private String cvc = "";

	public void setNext(IKeyEventHandler next) {
		this.nextHandler = next;
	}

	public String display() {
		if (cvc.equals(""))
		{
			return "[123]" + "  ";
		}
		else
		{
			return "[" + cvc + "]" + "  ";
		}
	}

	public void key(String s, int count) {

		if (count >= 21 && count <= 23) 
		{
			if (s.matches("X|x")) 
			{
				if (cvc.length() > 0)
				{
					cvc = cvc.substring(0, cvc.length() - 1);
				}
			} else
			{
				cvc += s;
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