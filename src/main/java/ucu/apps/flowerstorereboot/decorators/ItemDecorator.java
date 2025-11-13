package ucu.apps.flowerstorereboot.decorators;

import ucu.apps.flowerstorereboot.model.Item;

public abstract class ItemDecorator extends Item {

    private final Item item;

    protected ItemDecorator(Item item) {
        this.item = item;
    }

    protected Item getItem() {
        return item;
    }

    @Override
    public String getDescription() {
        return item.getDescription();
    }
}
