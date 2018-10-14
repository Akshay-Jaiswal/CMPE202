import java.util.ArrayList;

public class Burger implements OrderComponents{

	ArrayList<Toppings> toppings = new ArrayList<Toppings>();
	String name;
	double price;
	
	public ArrayList<Toppings> getToppings() {
		return toppings;
	}

	public void setToppings(ArrayList<Toppings> toppings) {
		this.toppings = toppings;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Burger(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	public void addToppings(Toppings topping)
	{
		toppings.add(topping);
	}

	@Override
	public double getPrice() 
	{
		return this.price;
	}
}
