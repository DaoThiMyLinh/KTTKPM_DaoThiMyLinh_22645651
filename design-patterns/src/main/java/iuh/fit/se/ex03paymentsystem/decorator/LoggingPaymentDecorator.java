package iuh.fit.se.ex03paymentsystem.decorator;

import iuh.fit.se.ex03paymentsystem.strategy.PaymentStrategy;

public class LoggingPaymentDecorator extends PaymentDecorator {

    public LoggingPaymentDecorator(PaymentStrategy strategy) {
        super(strategy);
    }

    @Override
    public double pay(double amount) {
        System.out.printf("[LOG] Bat dau xu ly thanh toan: %,.0f%n", amount);
        double finalAmount = strategy.pay(amount);
        System.out.printf("[LOG] Ket thuc thanh toan. So tien cuoi cung: %,.0f%n", finalAmount);
        return finalAmount;
    }
}
