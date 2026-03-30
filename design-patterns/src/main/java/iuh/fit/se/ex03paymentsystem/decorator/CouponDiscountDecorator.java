package iuh.fit.se.ex03paymentsystem.decorator;

import iuh.fit.se.ex03paymentsystem.strategy.PaymentStrategy;

import java.util.Map;

public class CouponDiscountDecorator extends PaymentDecorator {

    private static final Map<String, Double> DISCOUNT_BY_CODE = Map.of(
            "SAVE10", 0.10,
            "SAVE5", 0.05
    );

    private final String couponCode;

    public CouponDiscountDecorator(PaymentStrategy strategy, String couponCode) {
        super(strategy);
        this.couponCode = couponCode;
    }

    @Override
    public double pay(double amount) {
        double amountAfterBase = strategy.pay(amount);
        double discountRate = DISCOUNT_BY_CODE.getOrDefault(couponCode, 0.0);

        if (discountRate == 0) {
            System.out.println("- Khong ap dung ma giam gia.");
            return amountAfterBase;
        }

        double discount = amountAfterBase * discountRate;
        System.out.printf("- Giam gia (%s - %.0f%%): %,.0f%n", couponCode, discountRate * 100, discount);
        return amountAfterBase - discount;
    }
}
