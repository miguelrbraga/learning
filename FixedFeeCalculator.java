package revenuecalculator;

public class FixedFeeCalculator implements RevenueCalculator {
	
	private double fee;
	
	public FixedFeeCalculator (double fee) { 
		
		this.fee = fee; 
		
	}

	@Override
	public double calculate(ClientEngagement clientEngagement) { 
		
		return fee; 
		
	}

}
