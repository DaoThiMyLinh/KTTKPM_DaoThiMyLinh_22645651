package iuh.fit.se.abstractfactory;

public class CreditCardProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("[Credit Card] Paid " + amount + " USD");
    }
}
