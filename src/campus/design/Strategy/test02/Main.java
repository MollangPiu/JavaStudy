package campus.design.Strategy.test02;

public class Main {
    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        cart.setPaymentStrategy(new PaypalStrategy("paypal"));
        cart.checkout(100);

        cart.setPaymentStrategy(new CreditCardStrategy("배트맨", "1234"));
        cart.checkout(500);
    }
}
