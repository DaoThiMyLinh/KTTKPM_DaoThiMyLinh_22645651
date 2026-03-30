package iuh.fit.se.ex01ordermanagement.decorator;

import iuh.fit.se.ex01ordermanagement.strategy.OrderStrategy;

public class LoggingDecorator extends OrderDecorator {

    public LoggingDecorator(OrderStrategy strategy) {
        super(strategy);
    }

    @Override
    public void execute() {
        System.out.println("[LOG] Start");
        strategy.execute();
        System.out.println("[LOG] End");
    }
}
