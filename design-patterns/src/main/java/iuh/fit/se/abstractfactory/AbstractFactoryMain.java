package iuh.fit.se.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        PaymentGatewayFactory payPalFactory = GatewayFactoryProvider.getFactory(GatewayType.PAYPAL);
        PaymentProcessor payPalProcessor = payPalFactory.createProcessor();
        ReceiptGenerator payPalReceipt = payPalFactory.createReceiptGenerator();

        payPalProcessor.pay(49.99);
        System.out.println(payPalReceipt.generateReceipt("ORDER-PP-001", 49.99));

        PaymentGatewayFactory momoFactory = GatewayFactoryProvider.getFactory(GatewayType.MOMO);
        PaymentProcessor momoProcessor = momoFactory.createProcessor();
        ReceiptGenerator momoReceipt = momoFactory.createReceiptGenerator();

        momoProcessor.pay(120000);
        System.out.println(momoReceipt.generateReceipt("ORDER-MM-002", 120000));
    }
}
