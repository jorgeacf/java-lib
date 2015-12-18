package com.jf.algorithms.math;

public final class Factorial {

    private Factorial() { }

    public static int calc(int n) {

        if(n == 0) { return 1; }

        return n * calc(n - 1);
    }

}
