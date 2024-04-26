package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.OrderStatus;
import entities.Product;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat sdfOrder = new SimpleDateFormat("dd/MM/yyyy HH:MM:ss");

		System.out.println("Enter client data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.println("Birth date (DD/MM/YYYY): ");
		Date date = sdf.parse(sc.nextLine());
		Client client = new Client(name, email, date);
		OrderStatus status = OrderStatus.PROCESSING;
		Order order = new Order(new Date(), status, client);

		System.out.println("\nEnter order Data:");
		System.out.println(order.getStatus());
		System.out.print("How many items to this order? ");
		int quantity = sc.nextInt();
		for (int i = 0; i < quantity; i++) {
			sc.nextLine();
			System.out.printf("Enter #%d item data:%n", i + 1);
			System.out.print("Product name: ");
			String prodName = sc.nextLine();
			System.out.print("Product price: ");
			double price = sc.nextDouble();
			System.out.print("Quantity: ");
			int itemQuantity = sc.nextInt();
			OrderItem orderItem = new OrderItem(itemQuantity, new Product(prodName, price));
			order.addItem(orderItem);
		}
		sc.close();
		order.setStatus(OrderStatus.PENDING_PAYMENT);

		System.out.printf(
				"ORDER SUMARY:%nOrder moment: %s%nOrder status: %s%nClient: %s (%s) - %s%n"
						+ "Order items:%n%s",
				sdfOrder.format(order.getMoment()), order.getStatus(), order.getClient().getName(), sdf.format(order.getClient().getBirthDate()),
				order.getClient().getEmail(), order);

	}

}
