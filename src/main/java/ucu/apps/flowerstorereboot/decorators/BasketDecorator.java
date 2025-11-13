package ucu.apps.flowerstorereboot.decorators;

import ucu.apps.flowerstorereboot.model.Item;

public class BasketDecorator extends ItemDecorator {

    private static final double BASKETCOST = 4.0;

    public BasketDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in a basket.";
    }

    @Override
    public double price() {
        return BASKETCOST + getItem().price();
    }
}