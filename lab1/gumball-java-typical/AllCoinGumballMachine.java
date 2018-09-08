
public class AllCoinGumballMachine implements GumaballMachineInterface
{

	private int num_gumballs;
    private int coinTotal;
    
	public AllCoinGumballMachine(int size) {
		num_gumballs = size;
		coinTotal = 0;
	}

	@Override
	public void insertQuarter(int coin) 
	{
		 if (coin == 1)
            {
			 	this.coinTotal = this.coinTotal+5;
            }
	        else if(coin==2)
	        {
	        	this.coinTotal = this.coinTotal+10;
	        }
	        else
	        {
	        	this.coinTotal = this.coinTotal+25;
	        }
	}

	@Override
	public int turnCrank() {
    	{
			if(this.coinTotal>=50)
			{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			this.coinTotal = 0;
	    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
	    			return this.coinTotal;
	    		}
	    		else
	    		{
	    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
	    			coinTotal=0;
	    			return coinTotal;
	    		}
			}
			else
				System.out.println("Your total amount till now is : "+coinTotal);
				return coinTotal;
    	}
	}

	
	
}
