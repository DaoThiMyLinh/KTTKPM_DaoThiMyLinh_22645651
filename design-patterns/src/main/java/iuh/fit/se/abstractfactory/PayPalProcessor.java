package iuh.fit.se.abstractfactory;

public class PayPalProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("[PayPal] Paid " + amount + " USD");
    }
}
