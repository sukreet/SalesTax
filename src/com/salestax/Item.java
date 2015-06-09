package com.salestax;

public class Item {
    private int quantity;
    private String name;
    private float cost;

    public Item(int quantity, String name, float cost) {
        this.quantity = quantity;
        this.name = name;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        Item other = (Item) obj;
        return this.quantity == other.quantity && this.name == other.name && this.cost == other.cost;
    }

    @Override
    public int hashCode() {
        return (int) (31 + quantity*cost);
    }
}
