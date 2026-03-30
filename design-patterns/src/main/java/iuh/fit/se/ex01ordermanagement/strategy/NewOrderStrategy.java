package iuh.fit.se.ex01ordermanagement.strategy;

public class NewOrderStrategy implements OrderStrategy {

    @Override
    public void execute() {
        System.out.println("Validating order information...");
    }
}
