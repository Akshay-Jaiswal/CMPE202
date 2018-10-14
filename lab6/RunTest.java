
public class RunTest {

	public static void main(String[] args) {
		
		Burger burger = new Burger("LBB", 5.99);
		burger.addToppings(new Toppings("Lettuse"));
		burger.addToppings(new Toppings("Tomato"));
		burger.addToppings(new Toppings("G Onion"));
		burger.addToppings(new Toppings("Jala grilled"));
		burger.addToppings(new Toppings("Bacon"));
		
		Sides fries = new Sides("LTL CAJ", 1.99);
		
		Order order = new Order(burger, fries);
		
		order.printBillReceipt();
		order.printPackingSlip();
	}

}
