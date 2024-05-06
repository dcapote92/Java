import java.util.Scanner;

public class Ex_03 {

	public static void main(String[] args) {
		System.out.println("1.Álcool 2.Gasolina 3.Diesel 4.Fim");
		int alc = 0, gas = 0, die = 0, aux = 0;
		Scanner sc = new Scanner(System.in);
		aux = sc.nextInt();
		while(aux != 4) {
			if(aux == 1)
				alc += 1;
			else if(aux == 2)
				gas += 1;
			else if(aux == 3)
				die += 1;
			aux = sc.nextInt();
		}
		sc.close();
		System.out.printf("MUITO OBRIGADO%nÁlcool: %d%nGasolina: %d%nDiesel: %d",alc,gas,die);
	}

}
