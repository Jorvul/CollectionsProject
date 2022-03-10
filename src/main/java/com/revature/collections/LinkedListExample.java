package com.revature.collections;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
	LinkedList<Integer> nums = new LinkedList<Integer>();
	
		nums.add(1);
		nums.add(2);
		nums.add(4);
		nums.add(3);
		nums.add(5);
		nums.addFirst(0);
		nums.poll();

		Collections.sort(nums);
		System.out.println(nums);

	}

}
