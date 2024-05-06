import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números inteiros A e B:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		sc.close();
		if (x % y == 0 || y % x == 0)
			System.out.println("Sao Multiplos");
		else
			System.out.println("Nao sao Multiplos");
	}

}