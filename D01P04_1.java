package com.learning.core.day1session1;


import java.util.Scanner;

public class D01P04_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter the number: ");
        int num1 = scanner.nextInt();
           
        int[] array = {7, 25, 5, 19, 30};
     
        boolean bingo = contains(array, num1) && contains(array, num1);
      
        if (bingo) {
            System.out.println("It's Bingo");
        } else {
            System.out.println("Not Found");
        }

        scanner.close();
    }

public static boolean contains(int[] array, int num) {
    for (int n : array) {
        if (n == num) {
            return true;
        }
    }
    return false;
}
}