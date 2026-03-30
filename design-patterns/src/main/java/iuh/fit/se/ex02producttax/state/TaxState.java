package iuh.fit.se.ex02producttax.state;

import iuh.fit.se.ex02producttax.context.TaxContext;

public interface TaxState {
    void handle(TaxContext context);
}
