package iuh.fit.se.ex01ordermanagement.strategy;

public class ProcessingOrderStrategy implements OrderStrategy {
    @Override
    public void execute() {
        System.out.println("Packing and shipping order...");
    }
}
