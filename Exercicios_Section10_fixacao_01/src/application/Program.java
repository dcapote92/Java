package application;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Quantos números você vai digitar? ");
		Integer[] numbers = new Integer[sc.nextInt()];
		for (int i = 0; i < numbers.length; i++) {
			System.out.print("Digite um número: ");
			numbers[i] = sc.nextInt();
		}
		sc.close();
		for (int i = 0; i < numbers.length; i++) {
			if(numbers[i] < 0) {
				System.out.println(numbers[i]);
			}
		}
	}

}
