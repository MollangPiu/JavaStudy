package campus.design.Strategy.test02;

public class PaypalStrategy implements PaymentStrategy{

    private String emailId;

    public PaypalStrategy(String email) {
        this.emailId = email;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount+" using Paypal.");
    }
}
