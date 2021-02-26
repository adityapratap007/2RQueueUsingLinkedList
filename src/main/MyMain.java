package main;

import implementtation.MyQueue;

public class MyMain {
    public static void main(String[] args) {
        MyQueue<String> queue = new MyQueue<String>();
        queue.enqueue("hello");
        queue.enqueue("world");
        queue.enqueue("generic queue");
        queue.traverse();
        String deleted = queue.dequeue();
        if(deleted != null)
        System.out.println("delete = " +deleted);
        else
            System.out.println("queue underflow");

        queue.traverse();
    }
}
