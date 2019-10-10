package revenuecalculator;

public class RoyaltyCalculator implements RevenueCalculator {
	
	private double percentage;
	
	public RoyaltyCalculator(double percentage) {
		
		this.percentage = percentage;
		
	}

	@Override
	public double calculate(ClientEngagement clientEngagement) {
		
		return (percentage/100) * clientEngagement.getAntecipatedRevenue();
		
	}
	
	

}
