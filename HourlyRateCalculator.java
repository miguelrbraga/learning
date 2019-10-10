package revenuecalculator;

public class HourlyRateCalculator implements RevenueCalculator {
	
	private double hourlyRate;
	
	public HourlyRateCalculator (double hourlyRate) {
		
		this.hourlyRate = hourlyRate;
		
	}

	@Override
	public double calculate(ClientEngagement clientEngagement) {
		
		return hourlyRate * clientEngagement.getHoursWorked();
		
	}

}
