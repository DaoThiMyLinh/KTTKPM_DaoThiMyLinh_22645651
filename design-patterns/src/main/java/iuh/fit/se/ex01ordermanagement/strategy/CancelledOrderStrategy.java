package iuh.fit.se.ex01ordermanagement.strategy;

public class CancelledOrderStrategy implements OrderStrategy {

    @Override
    public void execute() {
        System.out.println("Cancelling order and refunding...");
    }
}
