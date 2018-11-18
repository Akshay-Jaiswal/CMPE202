// package originalStrategy;

public class LatePenaltyStrategy implements PenaltyFeesStrategy {

	public LatePenaltyStrategy() { }

	@Override
	public double calculatePenaltyFees(double price) {

		System.out.println("Late Penalty Fees");

		double fees = price*0.2;
		return fees;
	}
}