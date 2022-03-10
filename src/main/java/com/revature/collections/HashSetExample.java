package com.revature.collections;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		HashSet<String> str = new HashSet<String>();
		
		str.add("Hello");
		str.add("my");
		str.add("friends");
		System.out.println(str);
		System.out.println(str.contains("my"));
		
		for(String ele : str) {
			System.out.println(ele);
		}
		

	}

}
