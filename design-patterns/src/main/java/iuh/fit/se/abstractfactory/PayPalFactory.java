package iuh.fit.se.abstractfactory;

public class PayPalFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new PayPalProcessor();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new PayPalReceiptGenerator();
    }
}
