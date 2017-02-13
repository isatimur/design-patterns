package xyz.isatimur.knowledgebase.design.patterns.strategy;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertNotNull;

/**
 * Created by isati on 13.02.2017.
 */
public class ShoppingCartTest {
    private ShoppingCart cart;

    @Before
    public void setUp() {
        cart = new ShoppingCart();
        Item tShirt = new Item("000310", 23);
        Item kite = new Item("000234", 460);
        cart.addItem(tShirt);
        cart.addItem(kite);

    }


    @Test
    public void testPayPal() {
        assertNotNull(cart);
        cart.pay(new PayPalPayment("Tomson", "1232130989"));

    }

    @Test
    public void testCreditCard() {
        assertNotNull(cart);
        cart.pay(new CreditCardPayment("Jay Lee", LocalDate.now(), "4356222314563246", "809"));
    }
}