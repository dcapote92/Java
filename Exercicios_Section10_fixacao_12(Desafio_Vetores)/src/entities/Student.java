package entities;

public class Student {
	private String name, email;

	public Student(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public Student() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}