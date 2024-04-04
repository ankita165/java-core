package com.learning.core.day2session1;

import java.util.ArrayList;
import java.util.List;

public class D02P05_7 {
    public static void main(String[] args) {
        String[] dictionary = {"abb", "abc", "xyz", "xyy"};
        String pattern = "foo";
        List<String> matchedWords = new ArrayList<>();
        
        for (String word : dictionary) {
            if (word.length() == pattern.length() && matchPattern(word, pattern)) {
                matchedWords.add(word);
            }
        }
        
        System.out.println("Words in the dictionary matching the pattern: " + matchedWords);
    }
    
    public static boolean matchPattern(String word, String pattern) {
        for (int i = 0; i < word.length(); i++) {
            if (pattern.charAt(i) != ' ' && pattern.charAt(i) != word.charAt(i)) {
                return false;
            }
        }
        return true;
    }
}