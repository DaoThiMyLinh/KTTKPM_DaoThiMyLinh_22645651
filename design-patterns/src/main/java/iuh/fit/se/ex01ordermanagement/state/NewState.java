package iuh.fit.se.ex01ordermanagement.state;

import iuh.fit.se.ex01ordermanagement.context.OrderContext;
import iuh.fit.se.ex01ordermanagement.strategy.*;
import iuh.fit.se.ex01ordermanagement.decorator.*;

public class NewState implements OrderState {

    @Override
    public void handle(OrderContext context) {

    OrderStrategy strategy =
        new LoggingDecorator(
            new ValidationDecorator(
                new NewOrderStrategy()
            )
        );

    strategy.execute();

        context.setState(new ProcessingState());
    }
}