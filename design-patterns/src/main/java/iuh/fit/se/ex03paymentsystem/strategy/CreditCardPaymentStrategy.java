package iuh.fit.se.ex03paymentsystem.strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    @Override
    public double pay(double amount) {
        System.out.println("Thanh toan bang the tin dung.");
        return amount;
    }
}
