package iuh.fit.se.ex03paymentsystem.state;

import iuh.fit.se.ex03paymentsystem.context.PaymentContext;
import iuh.fit.se.ex03paymentsystem.decorator.CouponDiscountDecorator;
import iuh.fit.se.ex03paymentsystem.decorator.LoggingPaymentDecorator;
import iuh.fit.se.ex03paymentsystem.decorator.ProcessingFeeDecorator;
import iuh.fit.se.ex03paymentsystem.strategy.PayPalPaymentStrategy;
import iuh.fit.se.ex03paymentsystem.strategy.PaymentStrategy;

public class PayPalState implements PaymentState {
    @Override
    public void handle(PaymentContext context) {
        PaymentStrategy strategy = new LoggingPaymentDecorator(
                new CouponDiscountDecorator(
                        new ProcessingFeeDecorator(
                                new PayPalPaymentStrategy(),
                                0.03
                        ),
                        context.getCouponCode()
                )
        );

        double finalAmount = strategy.pay(context.getAmount());
        System.out.printf("[PAYPAL] So tien thanh toan cuoi cung: %,.0f%n", finalAmount);
    }
}
