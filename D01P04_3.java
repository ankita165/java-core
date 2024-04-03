package com.learning.core.day1session1;

import java.util.HashMap;

public class D01P04_3 {
    public static void main(String[] args) {
        int[] arr = {7, 10, 5, 3, 4, 3, 5, 6};

        
        HashMap<Integer, Integer> map = new HashMap<>();

        
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            
            if (map.containsKey(num)) {
                System.out.println("First repeating element: " + num + ", Index: " + map.get(num));
                return;
            }
            
            map.put(num, i);
        }

        
        System.out.println("No repeating elements found.");
    }
}