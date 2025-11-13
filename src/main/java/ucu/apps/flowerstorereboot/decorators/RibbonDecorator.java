package ucu.apps.flowerstorereboot.decorators;

import ucu.apps.flowerstorereboot.model.Item;

public class RibbonDecorator extends ItemDecorator {

    private static final double RIBBON_COST = 40.0;

    public RibbonDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with ribbon.";
    }

    @Override
    public double price() {
        return RIBBON_COST + getItem().price();
    }
}
