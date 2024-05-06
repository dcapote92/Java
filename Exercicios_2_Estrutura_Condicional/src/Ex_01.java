import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro:");
		int x = sc.nextInt();
		sc.close();
		if (x < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");
	}

}
