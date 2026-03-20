package iuh.fit.se.factory;

public class EmailNotification implements Notification {
    @Override
    public void send(String message) {
        System.out.println("[EMAIL] " + message);
    }
}
