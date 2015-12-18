package com.jf.algorithms.string;

import junit.framework.TestCase;

public class PolymorphicStringTest extends TestCase {

    public void testIsPolymorphic() {

        assertTrue(PolymorphicStrings.isPolymorphic("aab", "xxy"));
        assertFalse(PolymorphicStrings.isPolymorphic("aab", "xyz"));
    }

}
