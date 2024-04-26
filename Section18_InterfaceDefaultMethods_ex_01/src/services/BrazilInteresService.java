package services;

public class BrazilInteresService implements InterestService{
	private double interestRate;
	
	public BrazilInteresService(double interestRate) {
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		return interestRate;
	}

	
	
	
}
