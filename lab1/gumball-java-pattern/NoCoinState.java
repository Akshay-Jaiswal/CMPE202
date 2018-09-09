

public class NoCoinState implements State {
    GumballMachine gumballMachine;
 
    public NoCoinState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }
 
	public void insertCoin(int coin) {
		System.out.println("You inserted a coin");
		//gumballMachine.setState(gumballMachine.getHasCoinState());
		
		switch(gumballMachine.type)
		{
		case "type1":
			if(coin==25)
			{
				gumballMachine.totalCost+=coin;
				System.out.println("1 quarters received, turn crank to get gumball.");
				gumballMachine.setState(gumballMachine.getHasCoinState());
			}
			else
				System.out.println("Wrong coin inserted.. Only quarters are accepted!");
			break;
		case "type2":
			if(coin==25)
			{
				gumballMachine.totalCost+=coin;
				if(gumballMachine.totalCost==50) 
				{
					System.out.println("2 quarters received, turn crank to get gumball.");
					gumballMachine.setState(gumballMachine.getHasCoinState());
				}
				else
					System.out.println("Need one more quarter..");
			}
			else
			{
				System.out.println("Wrong coin inserted.. Only quarters are accepted!");
				break;
			}
			break;
		case "TypeC":
			if(coin==25 || coin==10 || coin==5)
			{
				gumballMachine.totalCost+=coin;
				if(gumballMachine.totalCost>=50) 
				{
					System.out.println("50 cents received, turn crank to get gumball.");
					gumballMachine.setState(gumballMachine.getHasCoinState());
				}
				else
					System.out.println("Need more coins..");
			}
			else
			{
				System.out.println("Only quarters, nickels or dimes are accepted!");
				break;
			}
			break;
		} 
		
	}
 
	public void ejectCoin() {
		if(gumballMachine.totalCost==0)
			System.out.println("You haven't inserted a coin");
		else
		{
			gumballMachine.totalCost=0;
			System.out.println("Coins returned");
		}
	}
 
	public void turnCrank() {
		System.out.println("You turned, but there's less or no coins");
	 }
 
	public void dispense() {
		System.out.println("You need to pay first");
	} 
 
	public String toString() {
		return "waiting for coin";
	}
}
