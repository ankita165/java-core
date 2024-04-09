package com.learning.corejava.da4session1;

public class D04P01 {
	
	    private int maxSize;
	    private String[] stackArray;
	    private int top;

	    public D04P01(int size) {
	        this.maxSize = size;
	        this.stackArray = new String[maxSize];
	        this.top = -1;
	    }

	    public void push(String element) {
	        if (!isFull()) {
	            top++;
	            stackArray[top] = element;
	            System.out.println("Pushed: " + element);
	        } else {
	            System.out.println("Stack is full. Cannot push " + element);
	        }
	    }

	    public String pop() {
	        if (!isEmpty()) {
	            String poppedElement = stackArray[top];
	            top--;
	            System.out.println("Popped: " + poppedElement);
	            return poppedElement;
	        } else {
	            System.out.println("Stack is empty. Cannot pop element.");
	            return null;
	        }
	    }

	    public String peek() {
	        if (!isEmpty()) {
	            return stackArray[top];
	        } else {
	            System.out.println("Stack is empty.");
	            return null;
	        }
	    }

	    public boolean isEmpty() {
	        return (top == -1);
	    }

	    public boolean isFull() {
	        return (top == maxSize - 1);
	    }

	    public static void main(String[] args) {
	        D04P01 stack = new D04P01(5);
	        stack.push("Hello");
	        stack.push("world");
	        stack.push("java");
	        stack.push("Programming");

	        System.out.println("After Pushing 4 Elements:");
	        stack.display();

	        stack.pop();
	        System.out.println("After a Pop:");
	        stack.display();
	    }

	    public void display() {
	        for (int i = top; i >= 0; i--) {
	            System.out.print(stackArray[i] + " ");
	        }
	        System.out.println();
	    }
	}


