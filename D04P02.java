package com.learning.corejava.da4session1;



	class Node {
	    double data;
	    Node next;

	    public Node(double data) {
	        this.data = data;
	        this.next = null;
	    }
	}

	class Stack {
	    private Node top;

	    public Stack() {
	        this.top = null;
	    }

	    public void push(double data) {
	        Node newNode = new Node(data);
	        newNode.next = top;
	        top = newNode;
	    }

	    public double pop() {
	        if (isEmpty()) {
	            System.out.println("Stack is empty. Cannot pop element.");
	            return Double.NaN;
	        }
	        double poppedElement = top.data;
	        top = top.next;
	        return poppedElement;
	    }

	    public boolean isEmpty() {
	        return top == null;
	    }

	    public void display() {
	        Node current = top;
	        System.out.print("The elements of the stack are: ");
	        while (current != null) {
	            System.out.print(current.data + " ");
	            current = current.next;
	        }
	        System.out.println("null");
	    }
	}

	public class D04P02 {
	    public static void main(String[] args) {
	        Stack stack = new Stack();
	        double[] elements = {10.0, 20.0, 30.0, 40.0};

	        // Push elements onto the stack
	        for (double element : elements) {
	            stack.push(element);
	        }

	        // Display elements of the stack
	        stack.display();

	        // Pop twice and display the stack
	        stack.pop();
	        stack.pop();
	        System.out.print("After popping twice: ");
	        stack.display();
	    }
	}


