package revenuecalculator;

public class ClientEngagement {
	
	private final String client;
	private final int hoursWorked;
	private final double antecipatedRevenue;
	
	public ClientEngagement(final String client, final int hoursWorked, final double antecipatedRevenue) {
		
		this.client = client;
		this.hoursWorked = hoursWorked;
		this.antecipatedRevenue = antecipatedRevenue;
		
	}

	public String getClient() {
		return client;
	}

	public int getHoursWorked() {
		return hoursWorked;
	}

	public double getAntecipatedRevenue() {
		return antecipatedRevenue;
	}

}
