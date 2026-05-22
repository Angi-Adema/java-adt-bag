package com.angiadema.bag;

public class Main {

	public static void main(String[] args) {
		
		// Instantiate a new Bag object
		Bag<String> basket = new Bag<>();
		
		// Create an array to hold items
		String[] candy = {
				"Jelly Beans", 
				"Chocolate Bar", 
				"Atomic Fire Ball",
				"Chocolate Bar",
				"Atomic Fire Ball",
				"Atomic Fire Ball",
				"Jelly Beans",
				"Gummy Bears"
		};
		
		// Loop through the candy array to add the items to the basket
		for (String element : candy) {
			basket.add(element);
		}
		
		// Print the items in the bag
		System.out.println("Items in the basket are: ");
		basket.printBagContents();
		
		// Create an array of items to test contains() method
		String[] itemsTest = {
				"Jelly Beans",
				"Cinnamon Dots",
				"Gummy Bears"
		};
		
		// Print statement before running contains test
		System.out.println("\nDoes the basket contain these items?");
		
		// Loop through itemsTest and compare each element with items in basket
		for (String element : itemsTest) {
			System.out.println(element + ": " + basket.contains(element));
		}
		
		// Create a list of items to get quantity of
		String[] quantity = {
				"Jelly Beans",
				"Gummy Bears",
				"Atomic Fire Ball"
		};
		
		// Print statement before running the count test
		System.out.println("\nThe quantity of the selected items are:");
		
		// Loop through the quantity array calling .count to get quantity of each item
		for (String element : quantity) {
			System.out.println(element + ": " + basket.count(element));
		}
        
        // Remove an element and print new contents
        basket.remove("Atomic Fire Ball");
        
		// Print the items in the bag
		System.out.println("\nThe updated basket now has: ");
		basket.printBagContents();
        
        // Test contains() after removing quantity of 1 of specified item
        System.out.println("\nDoes the basket contain Atomic Fire Ball?");
        System.out.println(basket.contains("Atomic Fire Ball"));
        
        // Test the count() method to confirm quantity of one item removed
        System.out.println("\nHow many Atomic Fire Balls are there?");
        System.out.println(basket.count("Atomic Fire Ball"));
        
        // Separate Module 1 Critical Thinking from Module 2 Critical Thinking
        System.out.println("\n*_____________________________________Module 2_______________________________________*");
        
        // Create two instances of a bag object
        Bag<String> clothingShoppingBag = new Bag<>();
        Bag<String> jewelryShoppingBag = new Bag<>();
        
        // Clothing array
        String[] clothing = {
        		"T-Shirt", 
        		"Jeans", 
        		"T-Shirt", 
        		"Dress", 
        		"Dress", 
        		"Blouse",
        		"Sweater",
        		"Scarf"
        };
        
        // Jewelry array
        String[] jewelry = { 
        		"Pearl Necklace",
        		"Pearl Earrings",
        		"Diamond Pendant",
        		"Tennis Bracelet",
        		"Pearl Earrings",
        		"Emerald Ring",
        		"Diamond Pendant",
        		"Multistone Pin",
        		"Pearl Necklace",
        		"Sapphire Pendant",
        		"Ruby Earrings"
        };
        
        // Loop through clothing array and add items to clothingShoppingBag
        for (String item : clothing) {
        	clothingShoppingBag.add(item);
        }
        
        // Loop through jewelry array and add items to jewelryShoppingBag
        for (String item : jewelry) {
        	jewelryShoppingBag.add(item);
        }
        
        // Print the size of each bag using the size method
        System.out.println("\nThe size of the clothing bag is: " + clothingShoppingBag.size());
        System.out.println("\nThe size of the jewelry bag is: " + jewelryShoppingBag.size());
        
        // Merge the two Bag objects together using merge method
        clothingShoppingBag.merge(jewelryShoppingBag);
        
        // Print the merged shopping bags
        System.out.println("\nShopping bags combined into one bag:");
        clothingShoppingBag.printBagContents();
        
        // Create a new distinct bag calling the distinct() method
        System.out.println("\nItems in the new distinct shopping bag are:");
        clothingShoppingBag.distinct().printBagContents();
        
	}

}



