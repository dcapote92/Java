import java.util.Locale;
import java.util.Scanner;

public class Ex_03 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		byte quant = 0;
		float x, y, z, media;

		System.out.println("Digite um valor inteiro entre 1 e 5:");
		quant = sc.nextByte();

		for (int i = 0; i < quant; i++) {
			System.out.println("Digite três números decimales com uma casa decimal e separados por um espaço:");
			x = sc.nextFloat();
			y = sc.nextFloat();
			z = sc.nextFloat();
			media = (x * 2f + y * 3f + z * 5f) / 10f;
			System.out.printf("%.1f%n", media);
		}
		sc.close();

	}
}
