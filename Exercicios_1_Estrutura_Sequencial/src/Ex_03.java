import java.util.Scanner;
public class Ex_03 {

	public static void main(String[] args) {
		int A , B , C , D , DIFERENCA;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite os valores de A, B, C e D:");
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		sc.close();
		DIFERENCA = A * B - C * D;
		System.out.printf("DIFERENCA = %d",DIFERENCA);
	}

}
