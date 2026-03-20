package iuh.fit.se.abstractfactory;

public class MomoFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new MomoProcessor();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new MomoReceiptGenerator();
    }
}
