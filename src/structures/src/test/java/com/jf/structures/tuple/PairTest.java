package com.jf.structures.tuple;

import junit.framework.TestCase;

public class PairTest extends TestCase {

    public void testCreatingPairWithValuesInConstructor() {
        Pair<Integer, String> pair = new Pair<Integer, String>(123, "456");
        assertEquals(new Integer(123), pair.getValue1());
        assertEquals("456", pair.getValue2());
    }

    public void testCreatingPairWithValuesInSetters() {
        Pair<Integer, String> pair = new Pair<Integer, String>(0, "");
        pair.setValue1(123);
        pair.setValue2("456");
        assertEquals(new Integer(123), pair.getValue1());
        assertEquals("456", pair.getValue2());
    }

}
