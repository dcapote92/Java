import java.util.Locale;
import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		final double pi = 3.14159;
		double raio, area;
		System.out.println("Digite o raio para calcular a área do círculo:");
		raio = sc.nextDouble();
		sc.close();
		area = pi * Math.pow(raio, 2);
		System.out.printf("A = %.4f", area);
	}

}
