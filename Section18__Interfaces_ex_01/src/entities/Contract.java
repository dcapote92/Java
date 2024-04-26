package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private int number;
	private Date date;
	private double totalValue;
	private List<Installment> installments = new ArrayList<>();

	public Contract(int number, Date date, double totalValue) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
	}
	
	public Contract() {}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Date getData() {
		return date;
	}

	public void setData(Date date) {
		this.date = date;
	}

	public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	public void addInstallments(Installment inst) {
		installments.add(inst);
	}
	
	public void removeInstallment(Installment inst) {
		installments.remove(inst);
	}
	
	public List<Installment> getInstallments(){
		return installments;
	}
	
}
