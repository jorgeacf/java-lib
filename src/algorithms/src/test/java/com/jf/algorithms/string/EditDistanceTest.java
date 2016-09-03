package com.jf.algorithms.string;

import junit.framework.TestCase;

public class EditDistanceTest extends TestCase {

    public void testReturnRightDistance() {

        String str1 = "sunday";
        String str2 = "saturday";

        assertEquals(3, EditDistance.find(str1,str2));
    }

}
