package ucu.apps.flowerstorereboot.delivery;

import java.util.List;

import ucu.apps.flowerstorereboot.model.Item;

public interface Delivery {
    double deliver(List<Item> items);
}
