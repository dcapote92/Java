package services;

import java.util.Date;

import entities.Contract;
import entities.Installment;

public class ContractService {
	@SuppressWarnings("deprecation")
	public void processContract(Contract contract, int months) {
		PaypalService ps = new PaypalService();
		for (int i = 1; i <= months; i++) {
			double amount = contract.getTotalValue() / months;
			amount += ps.insterest(amount, i);
			amount += ps.paymentFee(amount);
			Installment installment = new Installment(new Date(contract.getData().getYear(),
					contract.getData().getMonth() + i, contract.getData().getDate()), amount);
			contract.addInstallments(installment);
		}
	}
}
