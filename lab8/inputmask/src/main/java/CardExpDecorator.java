/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardExpDecorator implements ICardDecorator {

	public CardExpDecorator() {
	}

	public String decorateCard(String s) {
		StringBuilder expiryDate = new StringBuilder();
		for (int i = 0; i < s.length(); i++) 
		{
			if (i == 2)
			{
				expiryDate.append("/" + s.charAt(i));
			}
			else
			{
				expiryDate.append(s.charAt(i));
			}
		}
		return expiryDate.toString();
	}
}