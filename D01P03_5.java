package com.learning.core.day1session1;

import java.util.Scanner;

public class D01P03_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter a number
        System.out.print("Enter a number to find its factorial: ");
        int number = scanner.nextInt();
        
        int factorial = 1;
        for (int i = 1; i <= number; i++) {
            factorial *= i;
        }
        
        System.out.println("Factorial of " + number + " is " + factorial);
        
        scanner.close();
    }
}
