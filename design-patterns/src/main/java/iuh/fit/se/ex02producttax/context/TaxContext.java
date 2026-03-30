package iuh.fit.se.ex02producttax.context;

import iuh.fit.se.ex02producttax.model.Product;
import iuh.fit.se.ex02producttax.state.TaxState;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class TaxContext {
    private TaxState state;
    private Product product;

    public void requestTaxCalculation() {
        state.handle(this);
    }
}
