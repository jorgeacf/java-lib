package com.jf.algorithms.utils;

import junit.framework.TestCase;

public class CheckUtilsTest extends TestCase {


    public void testArrayIsNull() {

        try {
            Integer[] array = null;

            CheckUtils.isNull(array, "argName");

            fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {

        }
    }

    public void testObjectIsNull() {

        try {

            Integer item = null;

            CheckUtils.isNull(item, "argName");

            fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {

        }
    }

}
