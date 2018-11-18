// package originalStrategy;

public class BookDamagesPenaltyStrategy implements PenaltyFeesStrategy {

	public BookDamagesPenaltyStrategy() { }

	@Override
	public double calculatePenaltyFees(double price) {

		System.out.println("Book Damages Penalty");

		double fees = price*0.4;
		return fees;
	}
}