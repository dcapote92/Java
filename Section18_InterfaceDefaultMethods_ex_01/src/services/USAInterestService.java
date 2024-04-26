package services;

public class USAInterestService implements InterestService{
	private double interestRate;
	
	public USAInterestService(double interestRate) {
		super();
		this.interestRate = interestRate;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return interestRate;
	}
	
	

}
