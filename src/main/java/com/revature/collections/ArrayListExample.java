package com.revature.collections;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		ArrayList <Integer> nums = new ArrayList<Integer>();
		
		nums.add(0);
		nums.add(5);
		nums.add(10);
		nums.add(15);
		nums.add(20);
		nums.add(25);
		nums.add(30);
		nums.remove(0); //removes first index
		nums.set(5,35); // replaces  specified index with new integer
		
		System.out.println(nums);
		System.out.println(nums.size()); //gets length
		
		for(int ele: nums) {
			System.out.println(ele);
		}

	}

}
