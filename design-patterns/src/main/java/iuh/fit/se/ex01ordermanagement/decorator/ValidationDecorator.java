package iuh.fit.se.ex01ordermanagement.decorator;

import iuh.fit.se.ex01ordermanagement.strategy.OrderStrategy;

public class ValidationDecorator extends OrderDecorator {

    public ValidationDecorator(OrderStrategy strategy) {
        super(strategy);
    }

    @Override
    public void execute() {
        System.out.println("Extra validation...");
        strategy.execute();
    }
}
