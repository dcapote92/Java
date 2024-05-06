package entities;

public class Person {
	private String name;
	private byte age;
	private float height;

	public Person(String name, byte age, float height) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public Person() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public float getHeight() {
		return height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

}