package iuh.fit.se.ex02producttax.strategy;

public class LuxuryTaxStrategy implements TaxStrategy {

    private final double luxuryRate;

    public LuxuryTaxStrategy() {
        this(0.20);
    }

    public LuxuryTaxStrategy(double luxuryRate) {
        this.luxuryRate = luxuryRate;
    }

    @Override
    public double calculate(double basePrice) {
        return basePrice * luxuryRate;
    }
}
