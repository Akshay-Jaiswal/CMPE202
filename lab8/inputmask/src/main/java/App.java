/* (c) Copyright 2018 Paul Nguyen. All Rights Reserved */

/**
 * Main App Class for Displaying Screen.
 */
public class App {

    private Screen screen;
    private CreditCardNum num;
    private CreditCardExp exp;
    private CreditCardCVC cvc;
    private int count;

    public App() {

        screen = new Screen();
        num = new CreditCardNum();
        exp = new CreditCardExp();
        cvc = new CreditCardCVC();
        
        num.applyDecorator(new CardNumDecorator());
        exp.applyDecorator(new CardExpDecorator());

        screen.addSubComponent(num);
        screen.addSubComponent(exp);
        screen.addSubComponent(cvc);

        count = 0;

    }

    public String display() {
        String output = "";
        output += "========================================\n";
        output += screen.name() + "\n";
        output += "========================================\n";
        output += "\n\n\n\n";
        output += screen.display() + "\n";
        output += "\n\n\n\n";
        output += "========================================\n";
        return output;
    }

    public void key(String ch) {
        // count++;
        if (ch.matches("X|x")) {
            // System.out.println("Count: " + count);
            screen.key(ch, count);
            if (count > 0)
                count--;
        }
        if (ch.matches("0|1|2|3|4|5|6|7|8|9")) {
            if (count < 23) {
                count++;
                // System.out.println("Count: " + count);
                screen.key(ch, count);
            }
        }

    }

}
