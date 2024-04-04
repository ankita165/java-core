package com.learning.core.day2session1;
import java.util.*;

public class D02P05_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] strings = new String[n];
        for (int i = 0; i < n; i++) {
            strings[i] = scanner.next();
        }
        System.out.println(canFormCircle(strings) ? "Yes" : "No");
        scanner.close();
    }
    
    public static boolean canFormCircle(String[] strings) {
        Map<Character, List<String>> graph = new HashMap<>();
        for (String str : strings) {
            char start = str.charAt(0);
            graph.computeIfAbsent(start, k -> new ArrayList<>()).add(str);
        }
        return dfs(graph, strings[0], strings[0].charAt(0), new HashSet<>(), 0);
    }
    
    public static boolean dfs(Map<Character, List<String>> graph, String current, char start, Set<String> visited, int count) {
        if (count == graph.size()) {
            return current.charAt(current.length() - 1) == start;
        }
        char end = current.charAt(current.length() - 1);
        for (String next : graph.getOrDefault(end, Collections.emptyList())) {
            if (!visited.contains(next)) {
                visited.add(next);
                if (dfs(graph, next, start, visited, count + 1)) {
                    return true;
                }
                visited.remove(next);
            }
        }
        return false;
    }
}