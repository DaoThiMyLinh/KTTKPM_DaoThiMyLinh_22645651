package iuh.fit.se.ex02producttax;

import iuh.fit.se.ex02producttax.context.TaxContext;
import iuh.fit.se.ex02producttax.model.Product;
import iuh.fit.se.ex02producttax.state.ExciseProductState;
import iuh.fit.se.ex02producttax.state.LuxuryProductState;
import iuh.fit.se.ex02producttax.state.NormalProductState;

public class Ex02Main {

    public static void main(String[] args) {
        TaxContext context = new TaxContext();

        Product milk = new Product("Milk", 100_000);
        context.setProduct(milk);
        context.setState(new NormalProductState());
        context.requestTaxCalculation();

        Product beer = new Product("Beer", 200_000);
        context.setProduct(beer);
        context.setState(new ExciseProductState());
        context.requestTaxCalculation();

        Product luxuryWatch = new Product("Luxury Watch", 1_000_000);
        context.setProduct(luxuryWatch);
        context.setState(new LuxuryProductState());
        context.requestTaxCalculation();

        System.out.println("--- KET LUAN ---");
        System.out.println("State chon bo thue phu hop theo loai san pham.");
        System.out.println("Strategy dong vai tro cac thuat toan tinh tung loai thue.");
        System.out.println("Decorator bo sung kiem tra va ghi log ma khong sua logic tinh thue goc.");
    }
}
