package applications;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Set<Student> courseA = new HashSet<>();
		Set<Student> courseB = new HashSet<>();
		Set<Student> courseC = new HashSet<>();

		for (char letter = 'A'; letter < 'D'; letter++) {
			System.out.printf("How many student for course %s? ", (char) (letter));
			int quantity = sc.nextInt();
			for (int i = 0; i < quantity; i++) {
				System.out.printf("Student #%d code: ", i + 1);
				int code = sc.nextInt();
				if (letter == 'A') {
					courseA.add(new Student(code));
				} else if (letter == 'B') {
					courseB.add(new Student(code));
				}else {
					courseC.add(new Student(code));
				}
			}
		}
		
		Set<Student> allCourses = new HashSet<>();
		allCourses.addAll(courseA);
		allCourses.addAll(courseB);
		allCourses.addAll(courseC);
		System.out.printf("Total students: %d", allCourses.size());
	}
}
