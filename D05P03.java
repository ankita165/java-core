package com.learning.corejava.da4session1;



	import java.util.Scanner;

	public class D05P03 {

	    public static boolean linearSearch(int[] arr, int key) {
	        for (int num : arr) {
	            if (num == key) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);


	        int size = scanner.nextInt();
	        int[] arr = new int[size];

	        
	        for (int i = 0; i < size; i++) {
	            arr[i] = scanner.nextInt();
	        }

	        
	        int key = scanner.nextInt();

	        
	        boolean found = linearSearch(arr, key);

	       
	        if (found) {
	            System.out.println("Element is Present");
	        } else {
	            System.out.println("Element is not Present");
	        }

	        scanner.close();
	    }
	}


