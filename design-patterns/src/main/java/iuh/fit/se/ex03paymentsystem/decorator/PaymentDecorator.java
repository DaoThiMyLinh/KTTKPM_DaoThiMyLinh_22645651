package iuh.fit.se.ex03paymentsystem.decorator;

import iuh.fit.se.ex03paymentsystem.strategy.PaymentStrategy;

public abstract class PaymentDecorator implements PaymentStrategy {

    protected PaymentStrategy strategy;

    public PaymentDecorator(PaymentStrategy strategy) {
        this.strategy = strategy;
    }
}
