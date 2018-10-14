import java.util.ArrayList;

public class Order 
{
//	ArrayList<OrderComponents> components = new ArrayList<OrderComponents>();
	Burger burger;
	Sides side;
	PrintStratagy stratagy;

	public Order(Burger burger, Sides side)
	{
		this.burger = burger;
		this.side = side;
	}
	
	public void printBillReceipt() 
	{
		stratagy = new PrintBillReceipt();
		stratagy.print(this);
	}
	
	public void printPackingSlip() 
	{
		stratagy = new PrintPackingSlip();
		stratagy.print(this);
	}

	public Burger getBurger() {
		return burger;
	}

	public void setBurger(Burger burger) {
		this.burger = burger;
	}

	public Sides getSide() {
		return side;
	}

	public void setSide(Sides side) {
		this.side = side;
	}

	public PrintStratagy getStratagy() {
		return stratagy;
	}

	public void setStratagy(PrintStratagy stratagy) {
		this.stratagy = stratagy;
	}
}
