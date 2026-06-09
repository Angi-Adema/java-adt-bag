package com.angiadema.bag;

import java.util.ArrayList;
import java.util.Set;

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
	
	// Return the total number of items in the bag including duplicates
	public int size() {
		return items.size();
	}
	
	// Merge bags together
	public void merge(Bag<T> otherBag) {
		
		// Loop through otherBag and add items to current items ArrayList
		for (T item : otherBag.items) {
			items.add(item);
		}
	}
	
	// Method to print only the item names and not the quantities
	// REFACTORED: Instead of using a standard for loop, an enhanced for loop is used
	//             in conjunction with a set to return a list of unique items
	public Bag<T> distinct() {
		
		// Create a new Bag object for the distinct list
		Bag<T> distinctItems = new Bag<>();
		
		// Instead of using .contains() to create a list of distinct items, use a Set
		Set<T> existingItems = new HashSet<>();
		
		// Loop through items using an enhanced for loop adding distinct items to the Bag
		// after checking the Set
		for (T item : items) {
			if (existingItems.add(item)) {
				distinctItems.add(item);
			}
		}
		return distinctItems;
	}
	
	// COMMENTED OUT ORIGINAL CODE
//	public Bag<T> distinct() {
//		
//		// Create a new Bag object for the distinct list
//		Bag<T> distinctItems = new Bag<>();
//		
//		// Loop through items in current bag and add to new bag if not already there
//		for (int i = 0; i < items.size(); i++) {
//			if (!distinctItems.contains(items.get(i))) {
//				distinctItems.add(items.get(i));
//			}
//		}
//		return distinctItems;
//	}
	
	// ArrayList is set to private, print method to print contents
	public void printBagContents() {
		System.out.println(items);
	}

}
