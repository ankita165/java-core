package com.learning.core.day3session1;


	import java.util.HashMap;
	import java.util.Map;

	public class D03P08_1 {
	    public static void main(String[] args) {
	        
	        Map<String, String> phoneBook = new HashMap<>();

	        
	        phoneBook.put("Archana Das", "1234567801");
	        phoneBook.put("Alok Sahu", "9876343210");
	        phoneBook.put("Boby Johnson", "4567890123");
	        phoneBook.put("Emma Brown", "7890123456");
	        phoneBook.put("Munna Behera", "2109876543");

	       
	        System.out.println("Phone Book Details:");
	        for (Map.Entry<String, String> entry : phoneBook.entrySet()) {
	            System.out.println("Name: " + entry.getKey() + ", Phone Number: " + entry.getValue());
	        }
	    }
	}


