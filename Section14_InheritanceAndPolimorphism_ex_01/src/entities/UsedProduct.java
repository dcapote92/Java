package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date manufactureDate;
	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

	public UsedProduct(String name, double price, Date manufactureDate) {
		super(name, price);
		this.manufactureDate = manufactureDate;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}
	
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName());
		sb.append(" (used) ");
		sb.append("$" + String.format("%.2f", getPrice()));
		sb.append(" Manufacture date: ");
		sb.append(sdf.format(getManufactureDate()) + ")");
		return sb.toString();
	}
}
