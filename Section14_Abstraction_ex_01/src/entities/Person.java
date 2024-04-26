package entities;

public class Person extends TaxPayer {
	private Double healthCare;

	public Person(String name, Double anualIncomes, Double healthCare) {
		super(name, anualIncomes);
		this.healthCare = healthCare;
	}

	public Double getHealthCare() {
		return healthCare;
	}

	public void setHealthCare(Double healthCare) {
		this.healthCare = healthCare;
	}
	
	@Override
	public Double tax() {
		Double tax = 0.0;
		if (getAnualIncomes() < 20000.00) {
			tax = getAnualIncomes() * .15;
		}else {
			tax = getAnualIncomes() *.25;
		}
		if (getHealthCare() > 0) {
			tax -= getHealthCare() * .5; 
		}
		return tax;
	}
}
