package com.learning.core.day2session1;
//Palindrome Solution

import java.util.Scanner;

public class D02P05_1 {
    public static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1; 
        while (left < right) {
            if (str.charAt(left)!= str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String str = scanner.nextLine();
        
        if (isPalindrome(str)) 
        {
            System.out.println("It is a Palindrome");
        } else {
            System.out.println("It is not a Palindrome");
        }
        scanner.close();
    }}
