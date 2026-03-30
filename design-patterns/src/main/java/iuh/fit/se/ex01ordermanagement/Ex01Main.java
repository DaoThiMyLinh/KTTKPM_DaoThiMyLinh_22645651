package iuh.fit.se.ex01ordermanagement;

import iuh.fit.se.ex01ordermanagement.state.CancelledState;
import iuh.fit.se.ex01ordermanagement.state.NewState;
import iuh.fit.se.ex01ordermanagement.context.OrderContext;

public class Ex01Main {

    public static void main(String[] args) {

        OrderContext context = new OrderContext();
        context.setState(new NewState());

        context.request();
        context.request();
        context.request();

        System.out.println("---- CANCEL ----");

        context.setState(new CancelledState());
        context.request();
    }
}
