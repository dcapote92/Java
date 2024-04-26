package entities;

public class Company extends TaxPayer{
	private Integer employees;

	public Company(String name, Double anualIncomes, Integer employees) {
		super(name, anualIncomes);
		this.employees = employees;
	}

	public Integer getEmployees() {
		return employees;
	}

	public void setEmployees(Integer employees) {
		this.employees = employees;
	}
	
	@Override
	public Double tax() {
		Double tax = 0.0;
		if (employees < 10) {
			tax = getAnualIncomes() * .16;
		}else {
			tax = getAnualIncomes() * .14;
		}
		return tax;
	}
}
