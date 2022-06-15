package bai_tap.queue;

import thuc_hanh.queue1.MyLinkedListQueue;

public class TestQueue {
    public static void main(String[] args) {
       Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.dequeue();
        queue.dequeue();
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);
        System.out.println("Dequeued item is " + queue.dequeue().keyWork);
    }
}
