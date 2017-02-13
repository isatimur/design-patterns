package xyz.isatimur.knowledgebase.design.patterns.strategy;

/**
 * Created by isati on 13.02.2017.
 */
public class Item {
    private final String id;
    private final int price;

    public Item(final String id, final int price) {
        this.id = id;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }
}
