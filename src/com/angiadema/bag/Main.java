package com.angiadema.bag;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate a new Bag object\
		Bag<String> shoppingCart = new Bag<>();
		
		// Add items including duplicates to the bag
		shoppingCart.add("Jelly Beans");
		shoppingCart.add("Chocolate Bar");
		shoppingCart.add("Atomic Fire Ball");
		shoppingCart.add("Chocolate Bar");
		shoppingCart.add("Atomic Fire Ball");
		shoppingCart.add("Atomic Fire Ball");
		shoppingCart.add("Jelly Beans");
		shoppingCart.add("Gummy Bears");
		
		// Call printBagContents() to print items in Bag
		System.out.println("Items currently in shopping cart:");
		shoppingCart.printBagContents();
		
		// Test the contains() method for specific items
		shoppingCart.contains("Jelly Beans");

	}

}
