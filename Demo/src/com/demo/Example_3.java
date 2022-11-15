package com.demo;

import java.util.HashMap;
import java.util.Set;

public class Example_3 {

	public static void main(String[] args) {
		HashMap hm = new HashMap();
		hm.put(10, "Deepika");
		hm.put(11, "Java");
		hm.put(12, "A");
		hm.put(1, 10);
		System.out.println("HashMap key value is :"+hm);
		
		Set s = hm.keySet();
		for(Object e :s) {
			System.out.println("Key:"+e);
			System.out.println("Value:"+hm.get(e));
		}
	}

}
