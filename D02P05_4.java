package com.learning.core.day2session1;

public class D02P05_4{
    public static void main(String[] args) {
        String str = "abcda";
        int deletions = minDeletionsForPalindrome(str);
        System.out.println("Minimum deletions required: " + deletions);
    }

    public static int minDeletionsForPalindrome(String str) {
        int n = str.length();
        int[][] dp = new int[n][n];

        for (int len = 2; len <= n; len++) {
            for (int i = 0; i < n - len + 1; i++) {
                int j = i + len - 1;
                dp[i][j] = (str.charAt(i) == str.charAt(j)) ? dp[i + 1][j - 1] : Math.min(dp[i][j - 1], dp[i + 1][j]) + 1;
            }
        }

        return dp[0][n - 1];
    }
}