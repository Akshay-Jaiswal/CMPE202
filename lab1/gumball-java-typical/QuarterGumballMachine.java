import java.util.List;

public class QuarterGumballMachine implements GumaballMachineInterface
{

    private int num_gumballs;
    private boolean has_quarter;

	public QuarterGumballMachine(int size)
	{
		num_gumballs = size;
		has_quarter = false;
	}
    
	public void insertQuarter(int coin)
    {
	 
	 if (coin == 3)
            {
        		this.has_quarter = true;
            }
        else 
            this.has_quarter = false ;
    }
	    
    public int turnCrank()
    {
    	if ( this.has_quarter )
    	{
    		if ( this.num_gumballs > 0 )
    		{
    			this.num_gumballs-- ;
    			this.has_quarter = false ;
    			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
    			return 25;
    		}
    		else
    		{
    			System.out.println( "No More Gumballs!  Sorry, can't return your quarter." ) ;
    			return 25;
    		}
    	}
    	else 
    	{
    		System.out.println("You chose Quarter Machine");
    		System.out.println( "Please insert a quarter" ) ;
    		return -1;
    	}        
    }
}
