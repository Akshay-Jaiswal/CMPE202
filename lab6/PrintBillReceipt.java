import java.util.ArrayList;

public class PrintBillReceipt implements PrintStratagy{

	@Override
	public void print(Order order) {
		
		String output    = "---------BILL RECEIPT---------\n";
				output  += "1	"+order.getBurger().getName()+"				"+order.getBurger().getPrice()+"\n";
		for(Toppings topping : order.getBurger().getToppings())
		{
			switch(topping.getName())
			{
			case "Lettuse":
				output += "		"+topping.getName()+"\n";
				break;

			case "Tomato":
				output += "		"+topping.getName()+"\n";
				break;
				
			case "Bacon":
				output += "		{{{{"+topping.getName()+"}}}}"+"\n";
				break;
				
			case "G Onion":
				output += "		->| "+topping.getName()+"\n";
				break;
				
			case "Jala grilled":
				output += "		->| "+topping.getName()+"\n";
				break;
				
			default:
				break;
			}
		}
		
				output += "1	"+order.getSide().getName()+"				"+order.getSide().getPrice()+"\n\n";
				
				output += "Sub. Total				"+(order.getBurger().getPrice()+order.getSide().getPrice())+"\n\n";
				
				System.out.println(output);
	}

}
