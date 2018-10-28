/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

public class CardNumDecorator implements ICardDecorator {

	public CardNumDecorator() {
	}

	public String decorateCard(String s) {
		StringBuilder number = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (i == 4 || i == 8 || i == 12)
				number.append(" " + s.charAt(i));
			else
				number.append(s.charAt(i));
		}
		return number.toString();
	}
}