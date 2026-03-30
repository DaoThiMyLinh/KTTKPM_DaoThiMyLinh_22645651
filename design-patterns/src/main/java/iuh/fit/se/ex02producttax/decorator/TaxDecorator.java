package iuh.fit.se.ex02producttax.decorator;

import iuh.fit.se.ex02producttax.strategy.TaxStrategy;

public abstract class TaxDecorator implements TaxStrategy {

    protected TaxStrategy strategy;

    public TaxDecorator(TaxStrategy strategy) {
        this.strategy = strategy;
    }
}
