package services;

public interface OnlinePaymentService {
	double paymentFee(double amount);
	double insterest(double amount, int months);
}
