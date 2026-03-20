package iuh.fit.se.abstractfactory;

public interface ReceiptGenerator {
    String generateReceipt(String orderId, double amount);
}
