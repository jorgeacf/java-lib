package com.jf.algorithms.utils;

import java.util.Random;

public class RandomUtils {

    private static final Random random;
    private static final long seed;

    private RandomUtils() { }

    static {
        seed = System.currentTimeMillis();
        random = new Random(seed);
    }

    public static int uniform(int n) {
        if(n <= 0) { throw new IllegalArgumentException("The parameter n should be greater than zero."); }
        return random.nextInt(n);
    }

}
