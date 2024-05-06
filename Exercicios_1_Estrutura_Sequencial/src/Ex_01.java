import java.util.Scanner;

public class Ex_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x,y,R;
		System.out.println("Digite o primeiro número:");
		x = sc.nextInt();
		System.out.println("Digite o segundo número:");
		y = sc.nextInt();
		sc.close();
		R = x + y;
		System.out.printf("SOMA = %d", R);
		
	}

}
