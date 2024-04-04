package com.learning.core.day2session1;


import java.util.*;
class D02P05_3 {
	
	static List<String> m = new ArrayList<>();

	
	public static void main(String[] args)
	{
		String s = "abc";
		subsequences(s, ""); 
		System.out.println(m);
	}

	private static void subsequences(String s,
										String n)
	{
		if (s.length() == 0) {
			m.add(n);
			return;
		}
		
		subsequences(s.substring(1), n + s.charAt(0));

		subsequences(s.substring(1), n);
	}
}