package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Contract;
import entities.Installment;
import services.ContractService;

public class Program {

	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Entre os dados do contrato:");
			System.out.print("Número: ");
			int number = sc.nextInt();
			sc.nextLine();
			System.out.print("Data (dd/MM/yyyy): ");
			Date date = sdf.parse(sc.nextLine());
			System.out.print("Valor do contrato: ");
			double totalValue = sc.nextDouble();
			System.out.print("Entre com o numero de parcelas: ");
			int months = sc.nextInt();
			System.out.println("Parcelas:");

			ContractService cs = new ContractService();
			Contract ct = new Contract(number, date, totalValue);
			cs.processContract(ct, months);
			double total = 0;
			for (Installment inst : ct.getInstallments()) {
				System.out.printf("%s - %.2f%n",sdf.format(inst.getDueDate()),inst.getAmount());
				total+=inst.getAmount();
			}
			System.out.printf("Total: %.2f",total);
		} catch (ParseException e) {
			System.out.println("Erro: " + e.getMessage());
		}
		sc.close();

	}

}
