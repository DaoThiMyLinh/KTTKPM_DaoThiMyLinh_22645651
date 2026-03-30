package iuh.fit.se.ex01ordermanagement.strategy;

public class DeliveredOrderStrategy implements OrderStrategy {
    @Override
    public void execute() {
        System.out.println("Order delivered successfully.");
    }
}
