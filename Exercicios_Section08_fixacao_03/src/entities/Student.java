package entities;

public class Student {
	public String name;
	public float trim1, trim2, trim3;

	public float finalGrade() {
		return trim1 + trim2 + trim3;
	}

	public float missingPoint() {
		float result = 60f - finalGrade();
		return result;

	}

	public void aproved() {

		if (finalGrade() >= 60f) {
			System.out.println("\nPASS");
		} else {
			System.out.println("\nFAILED");
			System.out.printf("MISSING %.2f POINTS", missingPoint());
		}
	}

}
