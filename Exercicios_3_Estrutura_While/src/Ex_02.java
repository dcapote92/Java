import java.util.Scanner;

public class Ex_02 {

	public static void main(String[] args) {
		int x = 1, y = 1;
		Scanner sc = new Scanner(System.in);

		while (x != 0 && y != 0) {
			System.out.println("Digite as cordenadas X e Y:");
			x = sc.nextInt();
			y = sc.nextInt();
			if (x > 0 && y > 0) {
				System.out.println("Q1");
			} else if (x < 0 && y > 0) {
				System.out.println("Q2");
			} else if (x < 0 && y < 0) {
				System.out.println("Q3");
			} else if (x > 0 && y < 0) {
				System.out.println("Q4");
			}
		}
		sc.close();

	}

}
