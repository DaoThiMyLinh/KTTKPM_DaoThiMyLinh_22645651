package iuh.fit.se.ex02producttax.strategy;

import java.util.List;

public class CompositeTaxStrategy implements TaxStrategy {

    private final List<TaxStrategy> strategies;

    public CompositeTaxStrategy(List<TaxStrategy> strategies) {
        this.strategies = strategies;
    }

    @Override
    public double calculate(double basePrice) {
        return strategies.stream()
                .mapToDouble(strategy -> strategy.calculate(basePrice))
                .sum();
    }
}
