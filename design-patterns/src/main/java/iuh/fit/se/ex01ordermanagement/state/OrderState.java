package iuh.fit.se.ex01ordermanagement.state;

import iuh.fit.se.ex01ordermanagement.context.OrderContext;

public interface OrderState {
    void handle(OrderContext context);
}
