package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GenerateItemTest {


    

    @Test
    public void shouldBeAbleToCreateAnObjectOfItemClass() {
        GenerateItem generateItem = new GenerateItem("1 book at 12.49");

        Item actualItem = generateItem.makeItem();
        Item expectedItem = new Item(1, " book", 12.49f);

        assertEquals(actualItem, expectedItem);
    }
}


