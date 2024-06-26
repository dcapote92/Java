package entities;

public class OrderItem {
	private int quantity;
	private Product prod;

	public OrderItem(int quantity, Product prod) {
		super();
		this.quantity = quantity;
		this.prod = prod;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Product getProd() {
		return prod;
	}

	public void setProd(Product prod) {
		this.prod = prod;
	}

	public double subTotal() {
		return getQuantity() * prod.getPrice();
	}
}
