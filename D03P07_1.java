package com.learning.core.day3session1;

	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.Scanner;

	public class D03P07_1 {
	    @SuppressWarnings("resource")
		public static void main(String[] args) {
	       
	        ArrayList<String> studentNames = new ArrayList<>();
	      
	        Collections.addAll(studentNames, "Jack", "Paul", "Henry", "Mary", "Ronaldo");
	        
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Enter the name to search:");
	        String name = sc.nextLine();
	      
	        System.out.println(studentNames.contains(name) ? "Found" : "Not Found");
	    }
	}


