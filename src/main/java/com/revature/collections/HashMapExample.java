package com.revature.collections;

import java.util.HashMap;


public class HashMapExample {

	public static void main(String[] args) {
		HashMap<String, Integer> balance = new HashMap<String, Integer>();
		
		balance.put("Jorge", 123);
		balance.put("Morgan", 456);
		balance.put("Xavier", 789);
		
	
		for(String key: balance.keySet()) {
			System.out.println(key + "=" + balance.get(key));
		}

	}

}
