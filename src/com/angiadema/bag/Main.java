package com.angiadema.bag;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate a new Bag object
		Bag<String> basket = new Bag<>();
		
		// Add items including duplicates to the bag
		basket.add("Jelly Beans");
		basket.add("Chocolate Bar");
		basket.add("Atomic Fire Ball");
		basket.add("Chocolate Bar");
		basket.add("Atomic Fire Ball");
		basket.add("Atomic Fire Ball");
		basket.add("Jelly Beans");
		basket.add("Gummy Bears");
		
		// Call printBagContents() to print items in Bag
		System.out.println("Items currently in basket:");
		basket.printBagContents();
		
		// Empty line for console formatting
		System.out.println();
		
		// Test the contains() method for specific items
		System.out.println("Does the basket contain jelly beans?");
		basket.contains("Jelly Beans");
		
        System.out.println("\nDoes the basket contain cinnamon dots?");
        basket.contains("Cinnamon Dots");
        
        System.out.println("\nDoes the basket contain gummy bears?");
        basket.contains("Gummy Bears");
        
        // Empty Line for console formatting
        System.out.println();
        
        // Test the count() method
        System.out.println("How many jelly beans are there?");
        basket.count("Jelly Beans");
        
        System.out.println("\nHow many gummy bears are there?"); 
        basket.count("Gummy Bears");
        
        System.out.println("\nHow many atomic fire balls are there?");
        basket.count("Atomic Fire Ball");
        
        // Remove an element and print new contents
        basket.remove("Gummy Bears");
        
        // Empty Line for console formatting
        System.out.println();
        
        System.out.println("Contents of the basket after removing gummy bears:");
        basket.printBagContents();
        
        // Test the contains() method for the removed item
        System.out.println("\nDoes the basket contain gummy bears?");
        basket.contains("Gummy Bears");
        
        // Test the count() method for the removed item
        System.out.println("\nHow many gummy bears are there?");
        basket.count("Gummy Bears");
	}

}



