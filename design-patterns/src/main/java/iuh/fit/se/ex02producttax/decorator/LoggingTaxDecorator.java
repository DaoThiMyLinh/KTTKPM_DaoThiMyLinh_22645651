package iuh.fit.se.ex02producttax.decorator;

import iuh.fit.se.ex02producttax.strategy.TaxStrategy;

public class LoggingTaxDecorator extends TaxDecorator {

    public LoggingTaxDecorator(TaxStrategy strategy) {
        super(strategy);
    }

    @Override
    public double calculate(double basePrice) {
        System.out.printf("[LOG] Start tax calculation for base price: %,.0f%n", basePrice);
        double tax = strategy.calculate(basePrice);
        System.out.printf("[LOG] End tax calculation. Tax amount: %,.0f%n", tax);
        return tax;
    }
}
