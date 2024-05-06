import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int numeroPeca1, quantidadePeca1, numeroPeca2, quantidadePeca2;
		float valorPeca1, valorPeca2, valorPago;
		System.out.println("Digite o número, quantidade e valor unitário da primeira peça:");
		numeroPeca1 = sc.nextInt();
		quantidadePeca1 = sc.nextInt();
		valorPeca1 = sc.nextFloat();
		System.out.println("Digite o número, quantidade e valor unitário da segunda peça:");
		numeroPeca2 = sc.nextInt();
		quantidadePeca2 = sc.nextInt();
		valorPeca2 = sc.nextFloat();
		sc.close();
		valorPago = quantidadePeca1 * valorPeca1 + quantidadePeca2 * valorPeca2;
		System.out.printf("VALOR A PAGAR: R$ %.2f", valorPago);
	}

}
