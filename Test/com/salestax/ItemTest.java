package com.salestax;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ItemTest {

    @Test
    public void testForReflexivity() {
        Item firstObject = new Item(1, "book", 12.49f);

        assertEquals(firstObject, firstObject);
    }

//    @Test
//    public void testForComparingNullObjectsWithA() {
//        Item firstObject = new Item(1, "book", 12.49f);
//
//        assertThat(firstObject, not(equalTo(null)));
//    }

    @Test
    public void testForEquality() {
        Item firstObject = new Item(1, "book", 12.49f);
        Item secondObject = new Item(1, "book", 12.49f);
        assertEquals(firstObject, secondObject);
    }

    //
//      @Test
//      public void testForDifferentObjects() {
//          Item firstObject = new Item(1,"book",12.49f);
//          Object one = new Integer(1);
//
//          assertThat(firstObject, is(NotEqual(one)));
//      }
//
    @Test
    public void testForSymmetry() {
        Item firstObject = new Item(1, "book", 12.49f);
        Item secondObject = new Item(1, "book", 12.49f);

        assertEquals(firstObject, secondObject);
        assertEquals(secondObject, firstObject);
    }

    @Test
    public void testForTransitivity() {
        Item firstObject = new Item(1, "book", 12.49f);
        Item secondObject = new Item(1, "book", 12.49f);
        Item thirdObject = new Item(1, "book", 12.49f);

        assertEquals(firstObject, secondObject);
        assertEquals(secondObject, firstObject);
        assertEquals(firstObject, thirdObject);
    }


    @Test
    public void equalityTestForHashCode() {
        Item firstObject = new Item(1, "book", 12.49f);
        Item secondObject = new Item(1, "book", 12.49f);

        assertEquals(firstObject.hashCode(), secondObject.hashCode());
    }
}
