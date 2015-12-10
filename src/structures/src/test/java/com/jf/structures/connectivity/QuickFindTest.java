package com.jf.structures.connectivity;

import junit.framework.TestCase;

public class QuickFindTest extends TestCase {

    public void testConnectivityWithElevenConnections() {

        QuickFind quickFind = new QuickFind(10);

        quickFind.union(4, 3);
        quickFind.union(3, 8);
        quickFind.union(6, 5);
        quickFind.union(9, 4);
        quickFind.union(2, 1);
        quickFind.union(8, 9);
        quickFind.union(5, 0);
        quickFind.union(7, 2);
        quickFind.union(6, 1);
        quickFind.union(1, 0);
        quickFind.union(6, 7);

        assertEquals(2, quickFind.count());
    }

}
