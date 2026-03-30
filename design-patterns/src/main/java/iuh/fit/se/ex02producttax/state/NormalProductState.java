package iuh.fit.se.ex02producttax.state;

import iuh.fit.se.ex02producttax.context.TaxContext;
import iuh.fit.se.ex02producttax.decorator.LoggingTaxDecorator;
import iuh.fit.se.ex02producttax.decorator.ValidationTaxDecorator;
import iuh.fit.se.ex02producttax.model.Product;
import iuh.fit.se.ex02producttax.strategy.CompositeTaxStrategy;
import iuh.fit.se.ex02producttax.strategy.TaxStrategy;
import iuh.fit.se.ex02producttax.strategy.VatTaxStrategy;

import java.util.List;

public class NormalProductState implements TaxState {
    @Override
    public void handle(TaxContext context) {
        Product product = context.getProduct();

        TaxStrategy strategy = new LoggingTaxDecorator(
                new ValidationTaxDecorator(
                        new CompositeTaxStrategy(List.of(
                                new VatTaxStrategy()
                        ))
                )
        );

        double tax = strategy.calculate(product.getBasePrice());
        double total = product.getBasePrice() + tax;

        System.out.printf("[NORMAL] %s | Gia goc: %,.0f | Thue: %,.0f | Tong: %,.0f%n",
                product.getName(), product.getBasePrice(), tax, total);
    }
}
