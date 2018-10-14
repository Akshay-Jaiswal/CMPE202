
public class Sides implements OrderComponents
{
	String name;
	double price;
	
	public Sides(String name, double price) {
		this.name = name;
		this.price = price;
	}
	
	@Override
	public double getPrice() 
	{
		return this.price;
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
}
