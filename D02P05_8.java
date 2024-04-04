package com.learning.core.day2session1;
import java.util.HashMap;
import java.util.Map;

public class D02P05_8 {
    public static void main(String[] args) {
        String input = "helloworld";
        boolean canSplit = canSplitIntoFourDistinctStrings(input);
        System.out.println(canSplit ? "Yes" : "No");
    }

    public static boolean canSplitIntoFourDistinctStrings(String input) {
        if (input.length() % 4 != 0) {
            return false; 
        }
        
        Map<Character, Integer> charCount = new HashMap<>();
        for (char c : input.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        
        for (int count : charCount.values()) {
            if (count != 1) {
                return false;
            }
        }
        
        return true;
    }
}