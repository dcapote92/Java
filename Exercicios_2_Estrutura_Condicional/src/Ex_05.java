import java.util.Locale;
import java.util.Scanner;

public class Ex_05 {

	public static void main(String[] args) {
		/*
		 * CODIGO ESPECIFICAÇÂO PREÇO 1 Cachorro Quente R$ 4.00 2 X-Salada R$ 4.50 3
		 * X-Bacon R$ 5.00 4 Torrada simples R$ 2.00 5 Refrigerante R$ 1.50
		 */
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o código do item e a quantidade do mesmo:");
		int cod = sc.nextInt();
		int quant = sc.nextInt();
		sc.close();
		float preco = 0f;
		if (cod == 1)
			preco = 4.00f;
		else if (cod == 2)
			preco = 4.50f;
		else if (cod == 3)
			preco = 5.00f;
		else if (cod == 4)
			preco = 2.00f;
		else if (cod == 5)
			preco = 1.50f;
		float valor = quant * preco;
		System.out.printf("Total : R$ %.2f", valor);
	}

}