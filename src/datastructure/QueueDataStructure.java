package datastructure;

import java.io.*;

class GFG {
    static final int capacity = 10;
    static class Queue {
        int queue[] = new int[capacity];
        int front;
        int rear;

         Queue()
        {
            front = -1;
            rear = -1;
        }

        void enqueue(int val)
        {
            if (front == -1) {
                front++;
            }

            if (rear == capacity - 1) {
                System.out.println("Queue overflow!!!");
                return;
            }

            queue[++rear] = val;
        }
        void dequeue()
        {
            if (front == -1 || front > rear) {
                System.out.println("Queue is empty!!!");
            }

            System.out.println(
                    "Front1 : "
                            + queue[front]);

            System.out.println(
                    "rear1 : "
                            + queue[rear]);

            System.out.println(
                    "Element deleted from queue : "
                            + queue[front]);
        }
    }

    public static void main(String[] args)
    {
        Queue q = new Queue();

        // Inserting elements in the queue
        // using enqueue operation
        q.enqueue(1);
        q.enqueue(3);

        // Deleting elements from the queue
        // using dequeue operation
        q.dequeue();
    }
}

// This code is contributed by adityamaharshi21

