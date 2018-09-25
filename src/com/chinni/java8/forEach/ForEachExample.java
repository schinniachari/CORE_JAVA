package com.chinni.java8.forEach;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ForEachExample {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(10, 20, 30, 40, 50, 10, 20, 30);

		// ACTUAL INTERNAL STORY
		Consumer<Integer> con = new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				System.out.println("in accept(-) " + t);
			}
		};
		list.forEach(con);

		// THE ABOVE ONE CAN BE DONE BY USING LAMBDA EXPRESSION

		list.forEach(t -> System.out.println(t));

		// NOW TO KNOW HOW TO REMOVE THE OBJECTS FROM THE LOOP
		for (Object obj : list) {System.out.println("in enhanced for looop "+list);
			Iterator<Integer> itr = list.iterator();
			while (itr.hasNext()) {
				if (itr.next().equals(10)) {
					itr.remove();
				}
			}
		}

		System.out.println(list);
		
		Map<String, Integer> items = new HashMap<>();
		items.put("A", 10);
		items.put("B", 20);
		items.put("C", 30);
		items.put("D", 40);
		items.put("E", 50);
		items.put("F", 60);

		// ACTUALLY INTERNALLY DONE AS
		BiConsumer<String, Integer> bConsumer = new BiConsumer<String, Integer>() {
			@Override
			public void accept(String t, Integer u) {
				System.out.println("Item : " + t + " Count : " + u);
			}
		};
		items.forEach(bConsumer);

		// SHORT FORM OF ABOVE LENGTHY PROCEDURE
		items.forEach((k, v) -> System.out.println("Item : " + k + " Count : " + v));

		items.forEach((k, v) -> {
			System.out.println("Item : " + k + " Count : " + v);
			if ("E".equals(k)) {
				System.out.println("Hello E");
			}
		});
	}
}
