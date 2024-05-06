package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.print("How much numbers on each vector A and B? ");
		int[] vectorA = new int[sc.nextInt()];
		int[] vectorB = new int[vectorA.length];
		for (int i = 0; i < vectorA.length; i++) {
			System.out.printf("Insert %d° vector A value: ", i+1);
			vectorA[i] = sc.nextInt();
		}
		for (int i = 0; i < vectorB.length; i++) {
			System.out.printf("Insert %d° vector B value: ", i+1);
			vectorB[i] = sc.nextInt();
		}
		sc.close();
		int[] vectorC = new int[vectorA.length];
		System.out.println("Resulting Vector:");
		for (int i = 0; i < vectorA.length; i++) {
			vectorC[i] = vectorA[i] + vectorB[i];
			System.out.println(vectorC[i]);
		}
	}

}
