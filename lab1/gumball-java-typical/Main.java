
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		String repeat = "y";
		int machineChoice=0;
		int actionChoice=0;
		int coinChoice=0;
		ArrayList<Integer> coinArray = new ArrayList<Integer>();
		try {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		QuarterGumballMachine quarterGumballMachine = new QuarterGumballMachine(10);
		TwoQuarterGumballMachine twoQuarterGumballMachine = new TwoQuarterGumballMachine(10);
		
		while(repeat.equals("Y") || repeat.equals("y"))
		{
			System.out.println("\n\nSelect a gumball machine : \n1. 25 cents Gumball Machine \n2. 50 centes Gumball Machine (Two Quarters)\n3. 50 cents Gumball Machine (All coins)");
			
				machineChoice = Integer.parseInt(br.readLine());		
				
				/*while(actionChoice!=2)
				{
					System.out.println("\nSelect action : \n1. Insert Coin \n2. Turn crank");
					actionChoice = Integer.parseInt(br.readLine());
					
					if(actionChoice==1)
					{
						System.out.println("\nInsert coin : \n1. Nikel \n2. Dime \n3. Quarter");
						coinChoice = Integer.parseInt(br.readLine());
						coinArray.add(coinChoice);
					}
				}*/
				
				switch(machineChoice)
				{
					case 1:
					{
						System.out.println("\nInsert coin : \n1. Nikel \n2. Dime \n3. Quarter");
						coinChoice = Integer.parseInt(br.readLine());
	
						quarterGumballMachine.insertQuarter(coinChoice);
						quarterGumballMachine.turnCrank();
						break;
					}
					case 2:
						System.out.println("You chose machine 2");
						for(int i=0;i<2;i++)
						{	
							System.out.println("\nInsert coin : \n1. Nikel \n2. Dime \n3. Quarter");
							coinChoice = Integer.parseInt(br.readLine());
							twoQuarterGumballMachine.insertQuarter(coinChoice);
							if(!twoQuarterGumballMachine.turnCrank())
							{
								i++;	
							}
						}
						break;
					
					case 3:
						System.out.println("You chose machine 3");
						break;
				}
				System.out.println("\n\nDo you want to continue : \n1. Yes(y/Y)\n2. No(n/N)");
				repeat = br.readLine();
		}	
		
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*GumballMachine gumballMachine = new GumballMachine(5);
		
		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);

		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();
		gumballMachine.insertQuarter( 25 );
		gumballMachine.turnCrank();

		System.out.println(gumballMachine);*/
}
