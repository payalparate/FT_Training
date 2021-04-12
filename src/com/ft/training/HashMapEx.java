package com.ft.training;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "Mango");
		map.put(2, "Banana");
		map.put(3, "Apple");
		System.out.println("Original size : " + map.size());
		Iterator<Integer> it1 = map.keySet().iterator();
		while (it1.hasNext()) {
			Integer key = it1.next();
			System.out.println(" Values : " + map.values());

			map.put(4, "Orange");
			map.put(5, "Watermelon");

		}

	}

}
