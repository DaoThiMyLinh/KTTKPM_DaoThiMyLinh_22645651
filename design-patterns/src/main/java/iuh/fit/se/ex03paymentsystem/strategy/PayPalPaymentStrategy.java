package iuh.fit.se.ex03paymentsystem.strategy;

public class PayPalPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Thanh toan bang PayPal.");
        return amount;
    }
}
