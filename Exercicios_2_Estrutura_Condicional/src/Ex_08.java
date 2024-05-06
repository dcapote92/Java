import java.util.Scanner;
import java.util.Locale;

public class Ex_08 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o salário:");
		double salario = sc.nextDouble();
		sc.close();
		double imposto = 0.0;
		if(salario <= 2000)
			System.out.println("Isento");
		else if(salario > 2000 && salario <= 3000) {
			imposto = salario * 0.08f;
			System.out.printf("R$ %.2f" ,imposto);
		}
		else if(salario > 3000 && salario <= 4500) {
			/* Exemplo
			 * salario = 3800
			 * salario % 3000 = 800 -> esses 800 são calculados na faixa de 18%
			 * 800 * 0.18 = 144
			 * restam 3000 por comprovar
			 * 3000 % 2000 = 1000 -> esses 1000 são calculados na faixa de 8%
			 * 1000 * 0.08 = 80
			 * imposto = 144 + 80 = 224
			 * */ 
			
			imposto = salario % 3000  * 0.18f + 1000 * 0.08f;
			System.out.printf("R$ %.2f" , imposto);
		}
		else if(salario > 4500) {
			/*Exemplo
			 * salario = 4800
			 * salario % 4500 = 300 -> 300 na faixa de 28%
			 * 300 * 0.28 = 84
			 * restam 4500 por comprovar
			 * 4500 % 3000 = 1500 -> 1500 na faixa de 18%
			 * 1500 * 0.18 = 270
			 * restam 3000 por comprovar
			 * 3000 % 2000 = 1000 -> 1000 na faixa de 8%
			 * 1000 * 0.08 = 80
			 * imposto =  84 + 270 + 80 = 434
			 * */
		
			imposto = salario % 4500 * 0.28f + (salario - (salario % 4500)) % 3000 * 0.18f + 1000 * 0.08f;
			System.out.printf("R$ %.2f" , imposto);
		}
	}
}
