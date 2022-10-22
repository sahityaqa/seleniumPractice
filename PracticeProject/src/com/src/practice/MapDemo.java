package com.src.practice;

import java.util.HashMap;
import java.util.Set;

public class MapDemo {

	public static void main(String[] args) {
		HashMap<Integer, String> map= new HashMap<Integer,String>();
		map.put(1, "ABC");
		map.put(2, null);
		map.put(3, "PQR");
		map.put(7, null);
		map.put(4, "ASDF");
		map.put(2, "SAhi");
		System.out.println(map);
		 Set<Integer> keys = map.keySet();
		 for(Integer k :keys) {
			 System.out.println(k+"------->"+map.get(k));
		 }

	}

}
