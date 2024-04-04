package com.learning.core.day2session1;

import java.util.Scanner;

public class D02P05_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      
        System.out.print("Enter a string:  ");
        String inputString = scanner.nextLine();
      
        System.out.println("Enter the number for vowels: ");
        int n = scanner.nextInt();
    
        StringBuilder m = new StringBuilder();
        for (int i = inputString.length() - 1; i >= 0 && n > 0; i--) {
            char ch = Character.toLowerCase(inputString.charAt(i));
            if ("aeiou".indexOf(ch) != -1) {
                
                m.insert(0, ch);
                           
            }
        }
      
       System.out.println(""+ m);

        scanner.close();
    }
}