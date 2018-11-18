// package originalStrategy;

import java.util.Arrays;
import java.util.List;

public class FeesStrategyMain {

	public static void main(String [] args) {

		//Create a List of Tax strategies for different scenarios
		List<PenaltyFeesStrategy> taxStrategyList =
				Arrays.asList(
						new LatePenaltyStrategy(),
						new BookDamagesPenaltyStrategy(),
						new BookLostPenaltyStrategy());

		//Calculate Tax for different scenarios with corresponding strategies
		for (PenaltyFeesStrategy penaltyFeesStrategy : taxStrategyList) {
			System.out.println(penaltyFeesStrategy.calculatePenaltyFees(75.0));
		}
	}
}