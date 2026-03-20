package iuh.fit.se.factory;

public class FactoryMain {
    public static void main(String[] args) {
        NotificationFactory factory = new NotificationFactory();

        Notification email = factory.createNotification(NotificationType.EMAIL);
        Notification sms = factory.createNotification(NotificationType.SMS);

        email.send("Đơn hàng #123 đã được xác nhận.");
        sms.send("Thanh toán đơn hàng #123 thành công.");
    }
}
