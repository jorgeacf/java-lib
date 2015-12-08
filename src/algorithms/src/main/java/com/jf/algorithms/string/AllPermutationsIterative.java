package com.jf.algorithms.string;

import java.util.LinkedList;
import java.util.List;

public final class AllPermutationsIterative {

    public static List<String> getPermutations(String inputString) {

        List<String> result = new LinkedList<String>();

        char[] a = inputString.toCharArray();
        int N = a.length;

        int[] p = new int[N];

        result.add(new String(a));
        int i = 1;
        int j;
        
        while(i < N) {

            if(p[i] < i) {
                
                j = i % 2 * p[i];
                swap(a, j, i);
                result.add(new String(a)); //System.out.println(String.format("%d %d", j, i));
                p[i]++;
                i = 1;
            }
            else {
                p[i] = 0;
                i++;
            }
            //System.out.println(String.format("%d %d", j, i));
        }

        return result;
    }

    private static void swap(char[] a, int j, int i) {

        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

}
