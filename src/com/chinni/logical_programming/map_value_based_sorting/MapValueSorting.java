package com.chinni.logical_programming.map_value_based_sorting;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class MapValueSorting {

	public static void main(String[] args) {

		Set<TestWrapper> set = new HashSet<TestWrapper>();
		TestWrapper tw1 = new TestWrapper();
		tw1.setId(1);
		tw1.setName("chinni");
		TestWrapper tw2 = new TestWrapper();
		tw2.setId(2);
		tw2.setName("chinni");
		set.add(tw2);
		set.add(tw1);

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("a", 1);
		map.put("c", 2);
		map.put("b", 3);
		map.put("d", 3);
		System.out.println(map);
		
 //TREE MAP WE CANNOT USE IT FOR SORTING OF THE MAP BECAUSE ITS CONSTRUCTOR BY DEFAULT EXPECTS
//	MAP'S KEY AS PARAMETER	
/*		Map<String,Integer> sortedMap=new TreeMap<String,Integer>();
		new Comparator<Map<String,Integer>>() {

			@Override
			public int compare(Map<String, Integer> o1, Map<String, Integer> o2) {
				//		int difference=o1.getValue()-o2.getValue();
//		return difference;
			}
		};*/

 
		System.out.println(sortByValue(map));

		Map<String, TestWrapper> mapObject = new HashMap<String, TestWrapper>();
		// mapObject.add()

	}

	public static <K, V extends Comparable<? super V>> Map<K, V> sortByValue(Map<K, V> map) {
		Set<Entry<K, V>> set = new HashSet<>(map.entrySet());
		System.out.println(set);
		Set<Entry<K, V>> resultantSet = new TreeSet<Entry<K, V>>(new Comparator<Entry<K, V>>() {
			public int compare(Entry<K, V> o1, Entry<K, V> o2) {
				int result = o1.getValue().compareTo(o2.getValue());
				return (result == 0) ? 1 : result;
			}
		});
		resultantSet.addAll(set);
		System.out.println("RS->" + resultantSet);
		Map<K, V> resultMap = new LinkedHashMap<>();
		for (Entry<K, V> entry : resultantSet) {
			resultMap.put(entry.getKey(), entry.getValue());
		}
		return resultMap;
	}
}
