package entities;

public class Employee implements Comparable<Employee>{
	private String name;
	private Double wage;

	public Employee(String name, Double wage) {
		super();
		this.name = name;
		this.wage = wage;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getWage() {
		return wage;
	}

	public void setWage(Double wage) {
		this.wage = wage;
	}

	@Override
	public int compareTo(Employee other) {
		return name.compareTo(other.getName());
	}
	
	
}
