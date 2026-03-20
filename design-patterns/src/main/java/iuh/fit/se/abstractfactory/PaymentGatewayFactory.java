package iuh.fit.se.abstractfactory;

public interface PaymentGatewayFactory {
    PaymentProcessor createProcessor();

    ReceiptGenerator createReceiptGenerator();
}
