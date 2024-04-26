package applications;

import java.util.Map;
import java.util.TreeMap;

public class Program_01 {

	public static void main(String[] args) {
		Map<String, String> cookies = new TreeMap<>();

		cookies.put("username", "maria");
		cookies.put("email", "maria@gmail.com");
		cookies.put("phone", "997711122");

		cookies.remove("email");
		cookies.put("phone", "997711123");

		System.out.println("Contain 'phone' key: " + cookies.containsKey("phone"));
		System.out.println("Phone number: " + cookies.get("phone"));
		System.out.println("Email: " + cookies.get("email"));
		System.out.println("Size: " + cookies.size());

		System.out.println("ALL COOKIES:");
		for (String key : cookies.keySet()) {
			System.out.println(key + " : " + cookies.get(key));
		}
	}

}
