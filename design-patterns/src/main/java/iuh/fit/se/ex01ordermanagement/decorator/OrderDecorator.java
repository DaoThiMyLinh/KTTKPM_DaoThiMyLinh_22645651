package iuh.fit.se.ex01ordermanagement.decorator;

import iuh.fit.se.ex01ordermanagement.strategy.OrderStrategy;

public abstract class OrderDecorator implements OrderStrategy {

    protected OrderStrategy strategy;

    public OrderDecorator(OrderStrategy strategy) {
        this.strategy = strategy;
    }
}
