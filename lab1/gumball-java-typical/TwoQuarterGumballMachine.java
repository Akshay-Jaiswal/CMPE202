
public class TwoQuarterGumballMachine implements GumaballMachineInterface
{

	private int num_gumballs;
    private boolean has_quarter;
    private int coinCount;
    
	public TwoQuarterGumballMachine(int size) {
		num_gumballs = size;
		has_quarter = false;
		coinCount = 0;
	}

	@Override
	public void insertQuarter(int coin) 
	{
		 if (coin == 3)
	            {
	        		this.has_quarter = true;
	            }
	        else 
	            this.has_quarter = false ;
	}

	@Override
	public int turnCrank() {
		if ( this.has_quarter )
    	{
			coinCount++;
			if(coinCount>1)
			{
	    		if ( this.num_gumballs > 0 )
	    		{
	    			this.num_gumballs-- ;
	    			this.has_quarter = false ;
	    			coinCount=0;
	    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
	    			return 50;
	    		}
	    		else
	    		{
	    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
	    			coinCount=0;
	    			return 50;
	    		}
			}
			else
				return 25;
    	}
    	else 
    	{
    		System.out.println("You chose Two Quarter Machine");
    		System.out.println( "Please insert a quarter" ) ;
    		coinCount=0;
    		return -1;
    	}
	}

	
	
}
