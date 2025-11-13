package ucu.apps.flowerstorereboot.model;

import lombok.Getter;

public abstract class Item {
    @Getter
    private String description;

    public abstract String getDescription();
    public abstract double price();
}
