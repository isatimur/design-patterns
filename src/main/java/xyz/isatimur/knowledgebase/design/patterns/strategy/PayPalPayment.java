package xyz.isatimur.knowledgebase.design.patterns.strategy;

/**
 * Created by isati on 13.02.2017.
 */
public class PayPalPayment implements PaymentStrategy {
    private String owner, paypalAccount;

    public PayPalPayment(String owner, String paypalAccount) {
        this.owner = owner;
        this.paypalAccount = paypalAccount;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by PayPal");
    }
}
