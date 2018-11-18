// package originalStrategy;

import java.util.Arrays;
import java.util.List;

public class PenaltyFeesStrategyMainWithLambda {

	public static void main(String [] args) {

		//Create a List of Tax strategies for different scenarios with inline logic using Lambda
		List<PenaltyFeesStrategy> penaltyFeesList =
				Arrays.asList(
						(price) -> { System.out.println("Late book fees"); return price*0.2; },
						(price) -> { System.out.println("Book damages fees"); return price*0.4 ; },
						(price) -> { System.out.println("Book lost fees"); return price*1.2 ; }
			);

		//Calculate Tax for different scenarios with corresponding strategies
		penaltyFeesList.forEach((strategy) -> System.out.println(strategy.calculatePenaltyFees(75.0)));
	}
}
