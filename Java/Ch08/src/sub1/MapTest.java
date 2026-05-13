package sub1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class MapTest {
	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<>();
		map.put('A',"Apple");
		
		System.out.println(map);
		
		System.out.println("map 크기  " + map.size());
		
		System.out.println(map.get('A'));
		
		for(char k : map.keySet()) {
			System.out.println(k + " : " + map.get(k));
		}
		
		
		
		Map<Integer, Apple> m1 = new HashMap<>();
		m1.put(101, new Apple("한국"));
		
		
		Map<Integer, Apple> m2 = new HashMap<>();
		m2.put(201, new Apple("미국"));
		
		
		Map<Integer, Apple> m3 = new HashMap<>();
		m3.put(301, new Apple("영국"));
		
		List<Map<Integer,Apple>> list = new ArrayList<>();
		list.add(m1);
		list.add(m2);
		list.add(m3);
		
		Map<Integer,Apple> map1 = list.get(0);
		Apple apple  = map1.get(101);
		apple.show();
		
		
//		list.get(2).get(201).show();
//		list.get(3).get(301).show();
//		
		
		list.get(0).get(101).show(); // 한국
		list.get(1).get(201).show(); // 미국
		list.get(2).get(301).show(); // 영국
		
		
		
		// Properties실습
		
		Properties prop = new Properties();
		prop.put("A", "Apple");
		prop.setProperty("B", "Banana");
		
		System.out.println(prop);
		System.out.println(prop.getProperty("A"));
		System.out.println(prop.getProperty("D"));
	}

}
