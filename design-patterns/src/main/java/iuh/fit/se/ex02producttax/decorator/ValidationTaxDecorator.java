package iuh.fit.se.ex02producttax.decorator;

import iuh.fit.se.ex02producttax.strategy.TaxStrategy;

public class ValidationTaxDecorator extends TaxDecorator {

    public ValidationTaxDecorator(TaxStrategy strategy) {
        super(strategy);
    }

    @Override
    public double calculate(double basePrice) {
        if (basePrice <= 0) {
            throw new IllegalArgumentException("Gia goc cua san pham phai lon hon 0");
        }
        return strategy.calculate(basePrice);
    }
}
