package com.learning.corejava.da4session1;



public class D04P04 {
    private int maxSize;
    private int[] queueArray;
    private int front;
    private int rear;

    public Queue(int size) {
        this.maxSize = size;
        this.queueArray = new int[maxSize];
        this.front = 0;
        this.rear = -1;
    }

    public void enqueue(int element) {
        if (!isFull()) {
            rear++;
            queueArray[rear] = element;
        } else {
            System.out.println("Queue is full. Cannot enqueue " + element);
        }
    }

    public int dequeue() {
        if (!isEmpty()) {
            int removedElement = queueArray[front];
            front++;
            return removedElement;
        } else {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }
    }

    public boolean isEmpty() {
        return front > rear;
    }

    public boolean isFull() {
        return rear == maxSize - 1;
    }

    public void display() {
        if (!isEmpty()) {
            System.out.print("Elements in queue: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(queueArray[i] + " ");
            }
            System.out.println();
        } else {
            System.out.println("Queue is empty.");
        }
    }

    public static void main(String[] args) {
        Queue queue = new Queue(5);
        int[] elements = {10, 20, 30, 40};

        // Enqueue elements into the queue
        for (int element : elements) {
            queue.enqueue(element);
        }

        // Display elements of the queue
        queue.display();

        // Dequeue an element and display the queue
        queue.dequeue();
        System.out.print("After removing first element: ");
        queue.display();
    }
}


