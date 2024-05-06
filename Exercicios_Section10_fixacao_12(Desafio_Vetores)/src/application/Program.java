package application;

import java.util.Scanner;

import entities.Student;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Student[] rooms = new Student[10];
		System.out.print("How many students will rent rooms? ");
		int studentQuantity = sc.nextInt();
		for (int i = 0; i < studentQuantity; i++) {
			sc.nextLine();
			System.out.printf("%d° Student data:%n", i+1);
			Student student = new Student();
			System.out.print("Name: ");
			student.setName(sc.nextLine());
			System.out.print("Email: ");
			student.setEmail(sc.nextLine());
			System.out.print("Room: ");
			rooms[sc.nextInt()] = student;
		}
		sc.close();
		System.out.println("\nBusy rooms:");
		for (int i = 0; i < rooms.length; i++) {
			if(rooms[i] != null) {
				System.out.printf("%d: %s, %s%n",i, rooms[i].getName(), rooms[i].getEmail());
			}
				
		}
	}

}
