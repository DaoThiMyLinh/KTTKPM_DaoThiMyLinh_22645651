package iuh.fit.se.ex02producttax.strategy;

public class ExciseTaxStrategy implements TaxStrategy {

    private final double exciseRate;

    public ExciseTaxStrategy() {
        this(0.08);
    }

    public ExciseTaxStrategy(double exciseRate) {
        this.exciseRate = exciseRate;
    }

    @Override
    public double calculate(double basePrice) {
        return basePrice * exciseRate;
    }
}
