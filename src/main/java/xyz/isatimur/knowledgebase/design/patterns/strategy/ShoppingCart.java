package xyz.isatimur.knowledgebase.design.patterns.strategy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by isati on 13.02.2017.
 */
public class ShoppingCart {
    List<Item> items;
    private int total;

    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void pay(PaymentStrategy strategy) {
        int total = countTotaLAmount();
        strategy.pay(total);
    }

    public void removeItem(Item item) {
        items.remove(item);
    }

    public int countTotaLAmount() {
        return items.stream().mapToInt(a -> a.getPrice()).sum();
    }

}
