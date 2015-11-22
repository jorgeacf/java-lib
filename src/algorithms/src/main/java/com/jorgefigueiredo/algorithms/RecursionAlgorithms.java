package com.jorgefigueiredo.algorithms;

public final class RecursionAlgorithms {


    public static final class Factorial {

        public static int calc(int n) {

            if(n == 0) return 1;

            return n * calc(n-1);

        }

    }

}
