package com.jorgefigueiredo.lib.select;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class TopN {

	public static <K,V> LinkedHashMap<K,V> getTopNByValue(Map<K,V> map, int n) {
		
		List keys = new ArrayList(map.keySet());
		List values = new ArrayList(map.values());
		
		Collections.sort(keys, Collections.reverseOrder());
		Collections.sort(values, Collections.reverseOrder());
		
		
		LinkedHashMap<K, V> sortedMap = new LinkedHashMap<K, V>();
		
		Iterator valuesIt = values.iterator();
		
		while(valuesIt.hasNext()) {
			
			K k = null;
			V v = (V)valuesIt.next();
			
			Iterator keysIt = keys.iterator();
			while(keysIt.hasNext()) {
				K currentK = (K)keysIt.next();
				V currentV = (V)map.get(currentK);
				if(currentV != null && currentV.equals(v)) {
					k = currentK;
					keysIt.remove();
					break;
				}
			}
			
			sortedMap.put(k, v);
			
		}
		
		return sortedMap;
	}
	
}
