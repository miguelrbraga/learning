package revenuecalculator;

import java.util.Arrays;
import java.util.List;

public class RevenueCalculatorRunner {

	public static void main(String[] args) {

		final ClientEngagement clientEngagement = new ClientEngagement("Cerner",100,10000);
		
		HourlyRateCalculator h = new HourlyRateCalculator(10);
		System.out.println(h.calculate(clientEngagement));
		
		FixedFeeCalculator f = new FixedFeeCalculator(500);
		System.out.println(f.calculate(clientEngagement));
		
		RoyaltyCalculator r = new RoyaltyCalculator(20);
		System.out.println(r.calculate(clientEngagement));
		
		
		
		List<RevenueCalculator> rc = Arrays.asList(
				new HourlyRateCalculator(10),
				new FixedFeeCalculator(500),
				new RoyaltyCalculator(20));
		
		for (RevenueCalculator revenueCalculator: rc) {
			System.out.println(revenueCalculator.calculate(clientEngagement));
		}
			
	}

}
