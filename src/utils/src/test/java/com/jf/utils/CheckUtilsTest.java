package com.jf.utils;

import junit.framework.TestCase;

public class CheckUtilsTest extends TestCase {


    public void testArrayIsNull() {

        try {
            Integer[] array = null;

            CheckUtils.isNull(array, "argName");

            TestCase.fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {

        }
    }

    public void testObjectIsNull() {

        try {

            Integer item = null;

            CheckUtils.isNull(item, "argName");

            TestCase.fail("Should throw IllegalArgumentException");
        }
        catch (IllegalArgumentException ex) {

        }
    }

}
