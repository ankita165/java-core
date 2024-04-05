package com.learning.core.day3session1;


	import java.util.HashMap;
	import java.util.Map;
	public class D03P08_2 {

	
	    public static void main(String[] args) {
	        
	        Map<String, String> phoneBook = new HashMap<>();

	       
	        phoneBook.put("Archana Das", "1234567801");
	        phoneBook.put("Alok Sahu", "9876343210");
	        phoneBook.put("Boby Johnson", "4567890123");
	        phoneBook.put("Emma Brown", "7890123456");
	        phoneBook.put("Munna Behera", "2109876543");

	        
	        String nameToSearch = "Anika";
	        String phoneNumber = searchPhoneNumber(phoneBook, nameToSearch);
	        
	        
	        if (phoneNumber != null) {
	            System.out.println("Phone number for " + nameToSearch + ": " + phoneNumber);
	        } else {
	            System.out.println("No phone number found for " + nameToSearch);
	        }
	    }

	    public static String searchPhoneNumber(Map<String, String> phoneBook, String name) {
	        return phoneBook.getOrDefault(name, null);
	    }
	}


