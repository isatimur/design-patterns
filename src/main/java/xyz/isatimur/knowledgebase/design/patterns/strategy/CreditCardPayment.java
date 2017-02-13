package xyz.isatimur.knowledgebase.design.patterns.strategy;

import java.time.LocalDate;

/**
 * Created by isati on 13.02.2017.
 */
public class CreditCardPayment implements PaymentStrategy {
    private String owner;
    private LocalDate issueDate;
    private String accountNumber;
    private String cvc;

    public CreditCardPayment(String owner, LocalDate issueDate, String accountNumber, String cvc) {
        this.owner = owner;
        this.issueDate = issueDate;
        this.accountNumber = accountNumber;
        this.cvc = cvc;
    }

    @Override
    public void pay(int amount) {
        System.out.println(amount + " paid by CreditCard");
    }
}
