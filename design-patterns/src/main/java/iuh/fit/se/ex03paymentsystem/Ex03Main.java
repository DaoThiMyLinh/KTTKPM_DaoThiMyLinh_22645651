package iuh.fit.se.ex03paymentsystem;

import iuh.fit.se.ex03paymentsystem.context.PaymentContext;
import iuh.fit.se.ex03paymentsystem.state.CreditCardState;
import iuh.fit.se.ex03paymentsystem.state.PayPalState;

public class Ex03Main {

    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setAmount(1_200_000);
        context.setCouponCode("SAVE10");
        context.setState(new CreditCardState());
        context.requestPayment();

        context.setAmount(850_000);
        context.setCouponCode("NONE");
        context.setState(new PayPalState());
        context.requestPayment();

        System.out.println("--- KET LUAN ---");
        System.out.println("State chon kenh thanh toan theo ngu canh (Credit Card/PayPal).");
        System.out.println("Strategy dong goi logic xu ly rieng cua tung phuong thuc thanh toan.");
        System.out.println("Decorator bo sung phi xu ly va ma giam gia ma khong sua code xu ly goc.");
    }
}
