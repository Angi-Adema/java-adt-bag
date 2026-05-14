package com.angiadema.bag;

import java.util.ArrayList;

// Implement a Bag class with generic type
public class Bag<T> {
	
	// ArrayList to hold bag items
	private ArrayList<T> items;
	
	// Constructor to initialize the new Bag object
	public Bag() {
		items = new ArrayList<>();
	}
	
	// Add item of type T to the bag
	public void add(T item) {
		items.add(item);
	}
	
	// Remove one occurrence of the item from bag
	public void remove(T item) {
		items.remove(item);
	}
	
	// Return true or false if the item exists
	public boolean contains(T item) {
		return items.contains(item);
	}
	
	// Return the number of occurrences of an item
	public int count(T item) {
		
		// Variable to hold the number item appears in bag
		int totalDupItem = 0;
		
		// Loop through the items arraylist to get total
		for (T currentVal : items) {
			
			// Compare current value with item, add if the same
			if (currentVal.equals(item)) {
				totalDupItem++;
			}
		}
		return totalDupItem;
	}
	
	// ArrayList is set to private, print method to print contents
	public void printBagContents() {
		System.out.println(items);
	}

}
