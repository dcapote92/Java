package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much people will be inserted? ");
		int quantity = sc.nextInt();
		String[] names = new String[quantity];
		byte[] ages = new byte[quantity];
		byte older = 0;
		byte olderPos = 0;
		sc.nextLine();
		for (int i = 0; i < quantity; i++) {
			System.out.printf("%d° person data:%n", i+1);
			System.out.print("Name: ");
			names[i] = sc.nextLine();
			System.out.print("Age: ");
			ages[i] = sc.nextByte();
			sc.nextLine();
			if(ages[i] > older) {
				older = ages[i];
				olderPos = (byte)i;
			}
		}
		sc.close();
		System.out.printf("Older person: %s", names[olderPos]);
	}

}
