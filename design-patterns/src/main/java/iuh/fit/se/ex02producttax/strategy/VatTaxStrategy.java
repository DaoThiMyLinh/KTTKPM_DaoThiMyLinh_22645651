package iuh.fit.se.ex02producttax.strategy;

public class VatTaxStrategy implements TaxStrategy {

    private final double vatRate;

    public VatTaxStrategy() {
        this(0.10);
    }

    public VatTaxStrategy(double vatRate) {
        this.vatRate = vatRate;
    }

    @Override
    public double calculate(double basePrice) {
        return basePrice * vatRate;
    }
}
