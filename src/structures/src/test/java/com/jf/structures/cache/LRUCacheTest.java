package com.jf.structures.cache;

import junit.framework.TestCase;

import java.util.Arrays;
import java.util.List;

public class LRUCacheTest extends TestCase {

    public void testLRUCache() {

        LRUCache<Integer, Integer> cache = new LRUCache<Integer, Integer>(5);

        cache.set(1, 1);
        cache.set(2, 2);
        cache.set(3, 3);
        cache.set(4, 4);
        cache.set(5, 5);
        cache.set(6, 6);

        List<Integer> items1 = cache.getCachedItems();
        Integer item1 = cache.get(3);
        List<Integer> items2 = cache.getCachedItems();
        Integer item2 = cache.get(2);
        List<Integer> items3 = cache.getCachedItems();
        Integer item3 = cache.get(99);

        assertEquals(new Integer(3), item1);
        assertEquals(new Integer(2), item2);
        assertNull(item3);
        assertTrue(Arrays.equals(items1.toArray(new Integer[0]), new Integer[] { 6, 5, 4, 3, 2 }));
        assertTrue(Arrays.equals(items2.toArray(new Integer[0]), new Integer[] { 3, 6, 5, 4, 2 }));
        assertTrue(Arrays.equals(items3.toArray(new Integer[0]), new Integer[] { 2, 3, 6, 5, 4 }));
        assertNotNull(cache.toString());
    }

}
