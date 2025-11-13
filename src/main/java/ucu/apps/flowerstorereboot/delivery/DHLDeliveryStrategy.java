package ucu.apps.flowerstorereboot.delivery;

import java.util.List;

import ucu.apps.flowerstorereboot.model.Item;

public class DHLDeliveryStrategy implements Delivery {

    private static final double MULTIPLIER = 0.10;

    @Override
    public double deliver(List<Item> items) {
        double sum = 0.0;
        for (Item item : items) {
            sum += item.price();
        }
        return sum * MULTIPLIER;
    }

}
