import java.util.Scanner;

public class Ex_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horaInicial, horaFinal, duracao;
		System.out.println("Digite a hora inicial e a hora final:");
		horaInicial = sc.nextInt();
		horaFinal = sc.nextInt();
		sc.close();
		if(horaFinal < horaInicial)
			duracao = (horaFinal + 24) - horaInicial;
		else if ( horaInicial == horaFinal )
			duracao = 24;
		else
			duracao = horaFinal - horaInicial;
		System.out.printf("O JOGO DUROU %d HORA(S)",duracao);
		
	}

}