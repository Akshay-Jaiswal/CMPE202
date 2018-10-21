
public class BuildOrder {

    public static Component getOrder() {
        Composite order = new Composite("Order");

        CustomBurger customBurger1 = new CustomBurger("Build Your Own Burger");

        // base price for 1/3 lb
        Burger b = new Burger("Burger Options");
        String[] bo = { "Organic Bison*", "1/2lb.", "On A Bun" };
        b.setOptions(bo);

        // 1 cheese free, extra cheese +1.00
        Cheese c = new Cheese("Cheese Options");
        String[] co = { "Yellow American", "Spicy Jalapeno Jack" };
        c.setOptions(co);
        c.wrapDecorator(b);

        // 0 premium cheese free, per premium cheese +1.50
        PremiumCheese pc = new PremiumCheese("Premium Cheese Options");
        String[] pco = { "Danish Blue Cheese" };
        pc.setOptions(pco);
        pc.wrapDecorator(c);

        // 1 sauce free, extra +.50
        Sauce s = new Sauce("Sauce Options");
        String[] so = { "Mayonnaise", "Thai Peanut Sauce" };
        s.setOptions(so);
        s.wrapDecorator(pc);

        // all toppings free
        Toppings t = new Toppings("Toppings Options");
        String[] to = { "Dill Pickle Chips", "Black Olives", "Spicy Pickles" };
        t.setOptions(to);
        t.wrapDecorator(s);

        // premium topping +1.00 to +3.00
        PremiumToppings pt = new PremiumToppings("Premium Toppings Options");
        String[] pto = { "Marinated Tomatoes" };
        pt.setOptions(pto);
        pt.wrapDecorator(t);

        // Bun
        Bun bn = new Bun("Bun Options");
        String[] bno = { "Ciabatta (Vegan)" };
        bn.setOptions(bno);
        bn.wrapDecorator(pt);

        // Side +3.00
        Side sd = new Side("Side Options");
        String[] sdo = { "Shoestring Fries" };
        sd.setOptions(sdo);
        sd.wrapDecorator(bn);

        // Setup Custom Burger Ingredients
        customBurger1.setDecorator(sd);
        customBurger1.addChild(b);
        customBurger1.addChild(c);
        customBurger1.addChild(pc);
        customBurger1.addChild(s);
        customBurger1.addChild(t);
        customBurger1.addChild(pt);
        customBurger1.addChild(bn);
        customBurger1.addChild(sd);

        CustomBurger customBurger2 = new CustomBurger("Build Your Own Burger");

        // base price for 1/3 lb
        Burger b2 = new Burger("Burger Options");
        String[] bo2 = { "Hormone & Antibiotic Free Beef*", "1/3lb.", "On A Bun" };
        b2.setOptions(bo2);

        // 1 cheese free, extra cheese +1.00
        Cheese c2 = new Cheese("Cheese Options");
        String[] co2 = { "Smoked Gauda", "Greek Feta" };
        c2.setOptions(co2);
        c2.wrapDecorator(b2);

        // 0 premium cheese free, per premium cheese +1.50
        PremiumCheese pc2 = new PremiumCheese("Premium Cheese Options");
        String[] pco2 = { "Fresh Mozzarella" };
        pc2.setOptions(pco2);
        pc2.wrapDecorator(c2);

        // 1 sauce free, extra +.50
        Sauce s2 = new Sauce("Sauce Options");
        String[] so2 = { "Habanero Salsa" };
        s2.setOptions(so2);
        s2.wrapDecorator(pc2);

        // all toppings free
        Toppings t2 = new Toppings("Toppings Options");
        String[] to2 = { "Crushed Peanuts" };
        t2.setOptions(to2);
        t2.wrapDecorator(s2);

        // premium topping +1.00 to +3.00
        PremiumToppings pt2 = new PremiumToppings("Premium Toppings Options");
        String[] pto2 = { "Sunny Side Up Egg*", "Marinated Tomatoes" };
        pt2.setOptions(pto2);
        pt2.wrapDecorator(t2);

        // Bun
        Bun bn2 = new Bun("Bun Options");
        String[] bno2 = { "Gluten-Free Bun" };
        bn2.setOptions(bno2);
        bn2.wrapDecorator(pt2);

        // Side +3.00
        Side sd2 = new Side("Side Options");
        String[] sdo2 = { "Shoestring Fries" };
        sd2.setOptions(sdo2);
        sd2.wrapDecorator(bn2);

        // Setup Custom Burger Ingredients
        customBurger2.setDecorator(sd2);
        customBurger2.addChild(b2);
        customBurger2.addChild(c2);
        customBurger2.addChild(pc2);
        customBurger2.addChild(s2);
        customBurger2.addChild(t2);
        customBurger2.addChild(pt2);
        customBurger2.addChild(bn2);
        customBurger2.addChild(sd2);

        // Add Custom Burger to the ORder
        order.addChild(customBurger1);
        order.addChild(customBurger2);
        return order;
    }

}

/*
 * 
 * Counter Burger Menu: https://thecounterburger.emn8.com/?store=Times%20Square
 * 
 */