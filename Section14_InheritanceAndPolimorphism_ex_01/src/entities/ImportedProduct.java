package entities;

public class ImportedProduct extends Product {

	private double customFee;

	public ImportedProduct(String name, double price, double customFee) {
		super(name, price);
		this.customFee = customFee;
	}

	public double getCustomFee() {
		return customFee;
	}

	public void setCustomFee(double customFee) {
		this.customFee = customFee;
	}
	
	public double totalPrice() {
		return getPrice() + getCustomFee();
	}
	@Override
	public String priceTag() {
		StringBuilder sb = new StringBuilder();
		sb.append(getName() + " ");
		sb.append("$" + String.format("%.2f", totalPrice()));
		sb.append(" (Custom fee: $ "+ String.format("%.2f", getCustomFee()) + ")");
		return sb.toString();
	}
	
}
