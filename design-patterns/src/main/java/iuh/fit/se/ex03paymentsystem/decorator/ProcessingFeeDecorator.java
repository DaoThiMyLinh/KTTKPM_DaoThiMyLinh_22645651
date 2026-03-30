package iuh.fit.se.ex03paymentsystem.decorator;

import iuh.fit.se.ex03paymentsystem.strategy.PaymentStrategy;

public class ProcessingFeeDecorator extends PaymentDecorator {

    private final double feeRate;

    public ProcessingFeeDecorator(PaymentStrategy strategy, double feeRate) {
        super(strategy);
        this.feeRate = feeRate;
    }

    @Override
    public double pay(double amount) {
        double amountAfterBase = strategy.pay(amount);
        double fee = amountAfterBase * feeRate;
        System.out.printf("+ Phi xu ly (%.0f%%): %,.0f%n", feeRate * 100, fee);
        return amountAfterBase + fee;
    }
}
