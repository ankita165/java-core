package com.learning.corejava.da4session1;
import java.util.Stack;


public class D04P03 {
	
	

	
	    public static int evaluateExpression(String expression) {
	        
	        Stack<Integer> stack = new Stack<>();

	       
	        for (int i = 0; i < expression.length(); i++) {
	            char ch = expression.charAt(i);

	            
	            if (ch == ' ')
	                continue;

	          
	            if (Character.isDigit(ch)) {
	                int num = 0;
	             
	                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
	                    num = num * 10 + (expression.charAt(i) - '0');
	                    i++;
	                }
	             
	                stack.push(num);
	            }
	            
	            else {
	                int operand2 = stack.pop();
	                int operand1 = stack.pop();

	               
	                switch (ch) {
	                    case '+':
	                        stack.push(operand1 + operand2);
	                        break;
	                    case '-':
	                        stack.push(operand1 - operand2);
	                        break;
	                    case '*':
	                        stack.push(operand1 * operand2);
	                        break;
	                    case '/':
	                        stack.push(operand1 / operand2);
	                        break;
	                }
	            }
	        }
	     
	        return stack.pop();
	    }

	    public static void main(String[] args) {
	        String expression = "10 + 2 * 6";
	        System.out.println("Input: " + expression);
	        int result = evaluateExpression(expression);
	        System.out.println("Output: " + result);
	    }
	}


