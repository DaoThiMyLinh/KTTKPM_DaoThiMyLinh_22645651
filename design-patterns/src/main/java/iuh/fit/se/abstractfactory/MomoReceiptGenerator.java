package iuh.fit.se.abstractfactory;

public class MomoReceiptGenerator implements ReceiptGenerator {
    @Override
    public String generateReceipt(String orderId, double amount) {
        return "Receipt[Momo] - Order: " + orderId + ", Amount: " + amount + " VND";
    }
}
