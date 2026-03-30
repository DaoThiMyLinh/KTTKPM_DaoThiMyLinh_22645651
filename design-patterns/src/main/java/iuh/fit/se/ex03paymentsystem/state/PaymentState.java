package iuh.fit.se.ex03paymentsystem.state;

import iuh.fit.se.ex03paymentsystem.context.PaymentContext;

public interface PaymentState {
    void handle(PaymentContext context);
}
