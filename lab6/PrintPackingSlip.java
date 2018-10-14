import java.util.ArrayList;

public class PrintPackingSlip implements PrintStratagy{

	ArrayList<String> onTopBun = new  ArrayList<String>();
	ArrayList<String> onBottomBun = new  ArrayList<String>();
	ArrayList<String> onMeat = new  ArrayList<String>();
	
	@Override
	public void print(Order order) {
		
		for(Toppings topping : order.getBurger().getToppings())
		{
			if(topping.name.equals("Lettuse") || topping.name.equals("Tomato"))
			{
				onTopBun.add(topping.name);
			}
			if(topping.name.equals("G Onion") || topping.name.equals("Jala grilled"))
			{
				onMeat.add(topping.name);
			}
			if(topping.name.equals("Bacon"))
			{
				onBottomBun.add(topping.name);
			}
		}
		
		String output    = "---------PACKING SLIP---------\n";
		
				output  += "1	   "+order.getBurger().getName()+"\n";
		
		for(String top : onTopBun)
		{
			output += "		"+top+"\n";
		}
		for(String top : onMeat)
		{
			output += "		->| "+top+"\n";
		}
		for(String top : onBottomBun)
		{
			output += "		{{{{"+top+"}}}}\n";
		}
		
			output += "1	    "+order.getSide().getName()+"\n\n";
			
		System.out.println(output);
	}

}
