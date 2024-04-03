package com.learning.core.day1session1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class D01P04_4 {

    public static List<List<Integer>> findCombinations(int[] nums, int k) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums); 
        backtrack(nums, k, 0, new ArrayList<>(), result);
        return result;
    }

    private static void backtrack(int[] nums, int k, int start, List<Integer> current, List<List<Integer>> result) {
        if (k == 0) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i < nums.length; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue; 
            current.add(nums[i]);
            backtrack(nums, k - 1, i + 1, current, result);
            current.remove(current.size() - 1);
        }
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 2};
        int k = 2;
        List<List<Integer>> combinations = findCombinations(nums, k);
        System.out.println("Distinct combinations with k=" + k + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}