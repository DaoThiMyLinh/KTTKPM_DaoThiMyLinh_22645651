package iuh.fit.se.ex03paymentsystem.context;

import iuh.fit.se.ex03paymentsystem.state.PaymentState;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PaymentContext {
    private PaymentState state;
    private double amount;
    private String couponCode;

    public void requestPayment() {
        state.handle(this);
    }
}
