package com.salestax;

import java.util.Scanner;

public class Item {
    private String itemInput;

    public Item(String input) {
        this.itemInput = input;
    }


    public int getQuantity() {
        Scanner scanner = new Scanner(this.itemInput);
        //while (scanner.hasNextInt()){
        return scanner.nextInt();
    }
}
