package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void shouldExtractQuantityFromGivenString() {
        Item item = new Item("1 book at 12.49");

        assertEquals(1,item.getQuantity());
    }

}
