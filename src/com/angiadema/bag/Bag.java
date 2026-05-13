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
	void remove(T item) {
		items.remove(item);
	}
	
	// Return true or false if the item exists
	boolean contains(T item) {
		return items.contains(item);
	}
	
	// Return the number of occurrences of an item
	int count(T item) {
		
		// Variable to hold the number item appears in bag
		int totalDupItem = 0;
		
		// Loop through the items array to get total
		for (T currentVal : items) {
			
			// Compare current value with item, add if the same
			if (currentVal.equals(item)) {
				totalDupItem++;
			}
		}
		return totalDupItem;
	}
	
	// Print bag items
	public void printBagContents() {
		System.out.println(items);
	}

}
