import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro positivo:");
		int N = sc.nextInt();
		sc.close();
		for (int i = 1; i <= N; i++) {
			System.out.println(i + " " + (int) Math.pow(i, 2) + " "+ (int)Math.pow(i, 3));
		}
	}

}
