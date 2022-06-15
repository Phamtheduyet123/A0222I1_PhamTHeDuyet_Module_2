package bai_tap.queue;

public class Queue {
    private Node front;
    private Node rear;

    public Queue() {
        this.front = null;
        this.rear = null;
    }
    class Node {
        public int keyWork;
        public Node next;

        public Node(int key) {
            this.keyWork = key;
            this.next = null;
        }
    }
    public void enqueue(int key) {
        Node temp = new Node(key);
        if (this.rear == null) {
            this.front = this.rear = temp;
            this.rear.next = front;
            return;
        }
        this.rear.next = temp;
        this.rear = temp;
        this.rear.next= this.front;
    }
    public Node dequeue() {
        if (this.front == null)
            return null;
        else if (this.front == this.rear) {
            Node temp = this.front;
            this.front = this.rear = null;
            return temp;
        }
            Node temp = this.front;
            this.front = this.front.next;
            this.rear.next = this.front;
            return temp;

    }
//    void enQueue(T t) {
//        Node node = new Node(t);
//        if (head == null) {
//            head = node;
//        } else {
//            tail.next = node;
//        }
//
//        tail = node;
//        tail.next = head;
//        size++;
//    }
//
//    void deQueue() {
//        if (head != null) {
//            if (head.equals(tail)) {
//                head = null;
//                tail = null;
//            } else {
//                head = head.next;
//                tail.next = head;
//            }
//
//            size--;
//        }
//    }
}
