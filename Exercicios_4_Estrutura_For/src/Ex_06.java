import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número N:");
		int N = sc.nextInt();
		sc.close();
		for(int i = 1; i <= N; i++) {
			if( N % i == 0)
				System.out.println(i);
		}
	}

}
