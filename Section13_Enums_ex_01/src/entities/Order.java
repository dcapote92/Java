package entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
	private Date moment;
	private OrderStatus status;
	private List<OrderItem> orderList = new ArrayList<>();
	private Client client;

	public Order(Date moment, OrderStatus status, Client client) {
		super();
		this.moment = moment;
		this.status = status;
		this.client = client;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public OrderStatus getStatus() {
		return status;
	}

	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	public void addItem(OrderItem item) {
		orderList.add(item);
	}
	
	public void removeItem(OrderItem item) {
		orderList.remove(item);
	}
	
	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public double total() {
		double total = 0;
		for(OrderItem item : orderList) {
			total += item.subTotal();
		}
		return total;
	}
	
	@Override
	public String toString() {
		StringBuilder sb =new StringBuilder();
		for (OrderItem orderItem: orderList) {
			sb.append(orderItem.getProd().getName() + ", ");
			sb.append("$");
			sb.append(String.format("%.2f", orderItem.getProd().getPrice()) + ", ");
			sb.append("Quantity: ");
			sb.append(orderItem.getQuantity()+ ", ");
			sb.append("Subtotal: $");
			sb.append(String.format("%.2f", orderItem.subTotal()));
			sb.append("\n");
		}
		sb.append("Total price: $" + String.format("%.2f", total()));
		return sb.toString();
	}
}
