package iuh.fit.se.abstractfactory;

public class CreditCardReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String orderId, double amount) {
        return "Receipt[Credit Card] - Order: " + orderId + ", Amount: " + amount + " USD";
    }
}
