package utils;

public class CurrencyConverter {
	
	public static float dollarToReal(float dollarPrice, float quantity) {
		float converted = dollarPrice * quantity;
		converted += converted * 0.06;
		return converted;
	}

}
