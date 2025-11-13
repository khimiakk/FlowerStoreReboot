package ucu.apps.flowerstorereboot.decorators;

import ucu.apps.flowerstorereboot.model.Item;

public class PaperDecorator extends ItemDecorator {

    private static final double PAPER_COST = 13.0;

    public PaperDecorator(Item item) {
        super(item);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " in paper.";
    }

    @Override
    public double price() {
        return PAPER_COST + getItem().price();
    }
}
