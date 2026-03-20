package iuh.fit.se.abstractfactory;

public class GatewayFactoryProvider {
    public static PaymentGatewayFactory getFactory(GatewayType type) {
        return switch (type) {
            case CREDIT_CARD -> new CreditCardFactory();
            case PAYPAL -> new PayPalFactory();
            case MOMO -> new MomoFactory();
        };
    }
}
