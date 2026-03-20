package iuh.fit.se.abstractfactory;

public class CreditCardFactory implements PaymentGatewayFactory {
    @Override
    public PaymentProcessor createProcessor() {
        return new CreditCardProcessor();
    }

    @Override
    public ReceiptGenerator createReceiptGenerator() {
        return new CreditCardReceiptGenerator();
    }
}
