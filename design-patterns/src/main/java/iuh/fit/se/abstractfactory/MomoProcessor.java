package iuh.fit.se.abstractfactory;

public class MomoProcessor implements PaymentProcessor {
    @Override
    public void pay(double amount) {
        System.out.println("[Momo] Paid " + amount + " VND");
    }
}
