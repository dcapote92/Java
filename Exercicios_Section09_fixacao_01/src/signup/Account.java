package signup;

public class Account {
	private long number;
	private String ownerName;
	private double amount;
	private final double EXTRACT_FEE = 5.0;

	public Account(long number, String ownerName, double initialDeposit) {
		super();
		this.number = number;
		this.ownerName = ownerName;
		deposit(initialDeposit);;
	}

	public Account(long number, String ownerName) {
		super();
		this.number = number;
		this.ownerName = ownerName;
	}

	public long getNumber() {
		return number;
	}


	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public double getAmount() {
		return amount;
	}

	public void deposit(double amount) {
		this.amount += amount;
	}
	
	public void extract(double amount) {
		this.amount -= (amount + EXTRACT_FEE);
	}
	
	
	
	

}
