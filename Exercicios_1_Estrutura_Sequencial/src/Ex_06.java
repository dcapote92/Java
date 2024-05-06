import java.util.Locale;
import java.util.Scanner;

public class Ex_06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double A, B, C, TRIANGULO, CIRCULO,TRAPEZIO, QUADRADO, RETANGULO;
		final double pi = 3.14159;
		System.out.println("Digite os valores de A, B e C:");
		A = sc.nextFloat();
		B = sc.nextFloat();
		C = sc.nextFloat();
		sc.close();
		TRIANGULO = (A * C) / 2;
		CIRCULO = pi * Math.pow(C, 2);
		TRAPEZIO = ((A + B) * C) / 2;
		QUADRADO = Math.pow(B,2);
		RETANGULO = A * B;
		System.out.printf("TRIANGULO : %.3f%nCIRCILO : %.3f%nTRAPEZIO : %.3f%nQUADRADO : %.3f%nRETANGULO : %.3f%n",TRIANGULO, CIRCULO, TRAPEZIO, QUADRADO, RETANGULO);
		}

}
