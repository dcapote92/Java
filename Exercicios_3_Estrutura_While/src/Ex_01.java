import java.util.Scanner;

public class Ex_01 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite a senha: ");
		int s = sc.nextInt();
		while (s != 2002) {
			System.out.printf("Senha inválida%nDigite novamente:%n");
			s = sc.nextInt();
		}
		sc.close();
		System.out.println("Acesso Permitido");
	}

}
