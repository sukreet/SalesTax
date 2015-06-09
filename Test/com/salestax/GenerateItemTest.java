package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class GenerateItemTest {


    @Test
    public void shouldExtractQuantityFromGivenString() {
        GenerateItem generateItem = new GenerateItem("1 book at 12.49");

        assertEquals(1, generateItem.getQuantity());
    }

    @Test
    public void shouldBeAbleToCreateAnObjectOfItemClass() {
        GenerateItem generateItem = new GenerateItem("1 book at 12.49");
        Item actualItem = generateItem.makeItem();

        assertNotNull(actualItem);
    }
}


