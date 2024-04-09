package com.learning.corejava.da4session1;



public class D04P05 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public void CircularQueue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            rear = (rear + 1) % maxSize;
            queueArray[rear] = element;
        } else {
            System.out.println("Circular Queue is full. Cannot enqueue " + element);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedElement = queueArray[front];
            front = (front + 1) % maxSize;
            return removedElement;
        } else {
            System.out.println("Circular Queue is empty. Cannot dequeue element.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return (rear + 1) % maxSize == front;
    }

    public boolean isFull() {
        return (rear + 2) % maxSize == front;
    }

    public void display() {
        int i = front;
        System.out.print("Elements in circular queue: ");
        while (i != (rear + 1) % maxSize) {
            System.out.print(queueArray[i] + " ");
            i = (i + 1) % maxSize;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        CircularQueue circularQueue = new CircularQueue(5);
        int[] elements = {14, 13, 22, -8};

        // Enqueue elements into the circular queue
        for (int element : elements) {
            circularQueue.enqueue(element);
        }

        // Display elements of the circular queue
        circularQueue.display();

        // Dequeue an element and display the circular queue
        circularQueue.dequeue();
        System.out.print("After removing first element: ");
        circularQueue.display();
    }
}


