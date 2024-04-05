package com.learning.core.day3session1;
import java.util.HashSet;
public class D03P07_2 {
	
public static void main(String[] args) {
	        HashSet<String> products = new HashSet<>();
	        
	        products.add("P001 Maruti 800");
	        products.add("P002 Maruti Zen");
	        products.add("P003 Maruti Dezire");
	        products.add("P004 Maruti Alto");

	        System.out.println("Product Details:");
	        for (String product : products) {
	            System.out.println(product);
	        }
	    }
	}


