package com.angiadema.bag;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate a new Bag object
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
		System.out.println("\nDoes the shopping cart contain jelly beans? " + shoppingCart.contains("Jelly Beans"));
        System.out.println("Does the shopping cart contain cinnamon dots? " + shoppingCart.contains("Cinnamon Dots"));
        System.out.println("Does the shopping cart contain gummy bears? " + shoppingCart.contains("Gummy Bears"));
        
        // Test the count() method
        System.out.println("\nHow many jelly beans are there? " + shoppingCart.count("Jelly Beans"));
        System.out.println("How many gummy bears are there? " + shoppingCart.count("Gummy Bears"));
        System.out.println("How many atomic fire balls are there? " + shoppingCart.count("Atomic Fire Ball"));
        
        // Remove an element and print new contents
        shoppingCart.remove("Gummy Bears");
        
        System.out.println("\nContents of the shopping cart after removing gummy bears:");
        shoppingCart.printBagContents();
        
        // Test the contains() method for the removed item
        System.out.println("\nDoes the shopping cart contain gummy bears? " + shoppingCart.contains("Gummy Bears"));
        
        // Test the count() method for the removed item
        System.out.println("\nHow many gummy bears are there? " + shoppingCart.count("Gummy Bears"));
	}

}
