import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número inteiro entre 1 e 10:");
		int value = sc.nextInt();
		int in = 0, out = 0, x;
		for (int i = 0; i < value; i++) {
			System.out.println("Digite o " + i + "° valor:");
			x = sc.nextInt();
			if (x >= 10 && x <= 20)
				in += 1;
			else
				out += 1;
		}
		sc.close();
		System.out.printf("%d in%n%d out", in, out);
	}

}
