package com.learning.core.day2session1;
import java.util.Scanner;

public class D02P05_6{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String input = scanner.nextLine();
        int result = longestPrefixSuffixLength(input);
        System.out.println("Length of longest prefix suffix: " + result);
        scanner.close();
    }

    public static int longestPrefixSuffixLength(String s) {
        int n = s.length();
        for (int len = n / 2; len > 0; len--) {
            String prefix = s.substring(0, len);
            String suffix = s.substring(n - len);
            if (prefix.equals(suffix)) {
                return len;
            }
        }
        return 0;
    }
}