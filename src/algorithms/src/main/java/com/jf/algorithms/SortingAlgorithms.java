package com.jf.algorithms;

public final class SortingAlgorithms {

    public static final class Merge {

        public static void sort(Comparable[] a) {

            int N = a.length;
            Comparable[] aux = new Comparable[N];
            sort(a, aux, 0, N);

        }

        private static void sort(Comparable[] a, Comparable[] aux, int lo, int hi) {

            //System.out.println(String.format("SORT  [%s][%s] %d %d", printArray(a), printArray(aux), lo, hi ));

            if(hi - lo <= 1) { return; }

            int mid = lo + (hi - lo) / 2;
            sort(a, aux, lo, mid);
            sort(a, aux, mid, hi);

            //System.out.println(String.format("MERGE [%s][%s] %d %d %d", printArray(a), printArray(aux), lo, mid, hi ));
            merge(a, aux, lo, mid, hi);
        }

        private static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {

            int i = lo;
            int j = mid;

            for(int k = lo; k < hi; k++) {

                if      (i == mid)   { aux[k-lo] = a[j++]; }
                else if (j == hi)    { aux[k-lo] = a[i++]; }
                else if (a[i].compareTo(a[j]) > 0) { aux[k-lo] = a[j++]; }
                else { aux[k-lo] = a[i++]; }

            }

            for(int k = lo; k < hi; k++) {
                a[k] = aux[k-lo];
            }

        }

        private static String printArray(Comparable[] a) {
            StringBuilder sb = new StringBuilder();

            for(Comparable c : a) {

                if(sb.length() != 0) {
                    sb.append(", ");
                }
                sb.append(c != null ? c : " ");
            }

            return sb.toString();
        }

    }

    public static final class Quick {

        public static void sort(Integer[] input) {

            sort(input, 0, input.length-1);

        }

        private static void sort(Integer[] input, int lo, int hi) {

            //System.out.println(String.format("%d-%d", lo, hi));

            if(lo >= hi) { return; }

            int p = partitioning(input, lo, hi);

            //System.out.println(String.format("%d-%d-%d", lo, p, hi));

            sort(input, lo, p - 1);
            sort(input, p+1, hi);

        }

        public static Integer partitioning(Integer[] input) {
            return partitioning(input, 0, input.length-1);
        }

        private static Integer partitioning(Integer[] input, int lo, int hi) {

            int r = hi;
            int q = lo;
            int j = lo;

            while(j < hi) {

                if(input[j] <= input[r]) {
                    swap(input, q, j);
                    q++;
                }

                j++;
            }
            swap(input, q, r);
            return q;
        }

        private static void swap(Integer[] input, int a, int b) {
            int temp = input[a];
            input[a] = input[b];
            input[b] = temp;
        }

    }

}
