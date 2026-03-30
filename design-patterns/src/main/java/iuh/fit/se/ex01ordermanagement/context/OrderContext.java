package iuh.fit.se.ex01ordermanagement.context;

import iuh.fit.se.ex01ordermanagement.state.OrderState;
import lombok.Setter;

@Setter
public class OrderContext {

    private OrderState state;

    public void request() {
        state.handle(this);
    }
}
