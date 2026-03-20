package iuh.fit.se.factory;

public class NotificationFactory {
    public Notification createNotification(NotificationType type) {
        return switch (type) {
            case EMAIL -> new EmailNotification();
            case SMS -> new SmsNotification();
            case PUSH -> new PushNotification();
        };
    }
}
