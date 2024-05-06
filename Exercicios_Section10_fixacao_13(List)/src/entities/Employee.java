package entities;

public class Employee {
	private int id;
	private String name;
	private float wage;

	public Employee(int id, String name, float wage) {
		super();
		this.id = id;
		this.name = name;
		this.wage = wage;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getWage() {
		return wage;
	}

	public void increaseWage(float percent) {
		this.wage += wage*(percent/100);
	}
	
	
}
