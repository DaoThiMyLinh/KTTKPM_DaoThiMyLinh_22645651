package iuh.fit.se.abstractfactory;

public class PayPalReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String orderId, double amount) {
        return "Receipt[PayPal] - Order: " + orderId + ", Amount: " + amount + " USD";
    }
}
