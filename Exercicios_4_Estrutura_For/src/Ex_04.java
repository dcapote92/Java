import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro entre 1 e 5:");
		int N = sc.nextInt();
		for(int i = 0; i < N; i++) {
			System.out.println("Digite um par de número separados por um espaço:");
			int x = sc.nextInt();
			int y = sc.nextInt();
			if( y == 0)
				System.out.println("Divisão impossível!");
			else
				System.out.println((float)x / (float)y);
		}
		sc.close();
	}

}