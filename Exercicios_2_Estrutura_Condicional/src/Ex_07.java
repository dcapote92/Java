import java.util.Locale;
import java.util.Scanner;

public class Ex_07 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois valores com uma casa decimal:");
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		sc.close();
		if( x == 0 && y != 0)
			System.out.println("Eixo Y");
		else if( y == 0 && x != 0)
			System.out.println("Eixo X");
		else if( x == 0 && x == 0)
			System.out.println("Origem");
		else if( x > 0 && y > 0)
			System.out.println("Q1");
		else if( x < 0 && y > 0)
			System.out.println("Q2");
		else if( x < 0 && y < 0)
			System.out.println("Q3");
		else if( x > 0 && y < 0)
			System.out.println("Q4");
	}

}
