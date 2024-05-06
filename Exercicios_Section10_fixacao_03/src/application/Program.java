package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Person;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);		
		System.out.print("How many accounts will be added? ");
		Person[] persons = new Person[sc.nextInt()];
		sc.nextLine();
		String[] underAge = new String[persons.length];
		float sum = 0;
		for (int i = 0; i < persons.length; i++) {
			persons[i] = new Person();
			System.out.println((i+1) + "° person data:");
			System.out.print("Name: ");
			persons[i].setName(sc.nextLine());
			System.out.print("Age: ");
			persons[i].setAge(sc.nextByte());
			System.out.print("Height: ");
			persons[i].setHeight(sc.nextFloat());
			sc.nextLine();
			sum += persons[i].getHeight();
			if(persons[i].getAge() < 16) {
				underAge[i] = persons[i].getName();
			}
		}
		sc.close();
		
		System.out.printf("Media: %.2f%n", sum/persons.length  );
		sum = 0;
		for(int i = 0; i<underAge.length;i++) {
			if(underAge[i] != null) {
				sum++;
			}
		}
		if((int)sum != 0) {
			System.out.println("Persons with less than 16 years: " + (sum*100)/persons.length +"%" );
			for(int i = 0; i<underAge.length;i++) {
				if(underAge[i] != null) {
					System.out.println(underAge[i]);
				}
			}
		}
		
	}
}
