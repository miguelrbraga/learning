package revenuecalculator;

import java.util.Arrays;
import java.util.List;

public class SalesPredictor {

	public static void main(String[] args) {
		
		final List<ClientEngagement> engagements = Arrays.asList(
				new ClientEngagement("Bank A", 40, 4000),
				new ClientEngagement("Bank B", 30, 4000),
				new ClientEngagement("Bank C", 25, 1000),
				new ClientEngagement("Bank D", 10, 2000));
		
		System.out.println("Hourly Rate Revenue:");
		RevenueCalculator hourlyRate = new HourlyRateCalculator(23);
		printTotalRevenue(engagements, hourlyRate);

		System.out.println("Fixed Fee Revenue:");
		RevenueCalculator fixedFee = new FixedFeeCalculator(600);
		printTotalRevenue(engagements, fixedFee);
		
		System.out.println("Royalty Share Revenue:");
		RevenueCalculator royaltyShare = new RoyaltyCalculator(22);
		printTotalRevenue(engagements, royaltyShare);
	}
	
	private static void printTotalRevenue(final List<ClientEngagement> engagements
			, final RevenueCalculator rc) {
		
		double total = 0;
		for (ClientEngagement engagement: engagements) {
			
			total += rc.calculate(engagement);
			
		}
		
		System.out.println(total);
		
	}

}
