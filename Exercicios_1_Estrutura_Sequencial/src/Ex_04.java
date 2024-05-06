import java.util.Locale;
import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		int numeroFuncionario, horasTrabajadas;
		float valorHora, salarioFuncionario;
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o número do funcionário:");
		numeroFuncionario = sc.nextInt();
		System.out.println("Digite as horas trabalhadas:");
		horasTrabajadas = sc.nextInt();
		System.out.println("Digite o valor recebido pelo funcionário por hora trabalhada:");
		valorHora = sc.nextFloat();
		sc.close();
		salarioFuncionario = horasTrabajadas * valorHora;
		System.out.printf("Number = %d%nSALARY = U$ %.2f",numeroFuncionario,salarioFuncionario);
		
	}

}
