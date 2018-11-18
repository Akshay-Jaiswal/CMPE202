// package originalStrategy;

public class BookLostPenaltyStrategy implements PenaltyFeesStrategy {

	public BookLostPenaltyStrategy() { }

	@Override
	public double calculatePenaltyFees(double price) {

		System.out.println("Book Lost Penalty");

		double fees = price*1.2;
		return fees;
	}
}