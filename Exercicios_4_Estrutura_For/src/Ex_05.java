import java.util.Scanner;

public class Ex_05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um valor N:");
		int N = sc.nextInt();
		sc.close();

		int factorial = 1;

		for (int i = 1; i <= N; i++) {
			factorial *= i;
		}
		System.out.println(factorial);
	}
}
