package com.salestax;

import java.util.Scanner;

public class GenerateItem {
    private String itemInput;

    public GenerateItem(String input) {
        this.itemInput = input;
    }




    public Item makeItem() {
        Scanner scanner = new Scanner(this.itemInput);
        int quantity = scanner.nextInt();
        scanner.useDelimiter(" at ");
        String name = scanner.next();
        float cost = scanner.nextFloat();

        return new Item(quantity, name, cost);
    }


}
