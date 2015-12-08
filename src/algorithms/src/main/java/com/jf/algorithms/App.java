package com.jf.algorithms;

import java.util.LinkedList;
import java.util.List;

public class App {

    public static void main(String[] args) {




        List<String> l = new LinkedList<String>();
        String[] o = l.toArray(new String[0]);

        System.out.println(o == null);
        System.out.println(o.length);
    }

}
