package com.jf.utils;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.modules.junit4.PowerMockRunner;

import static org.junit.Assert.assertTrue;

@RunWith(PowerMockRunner.class)
public class RandomUtilsTest {

    @Test
    public void testToReturnRandomNumber() {
        int maxNumber = 10;
        int number = RandomUtils.uniform(maxNumber);
        assertTrue(number >= 0 && number <= maxNumber);
    }
}
