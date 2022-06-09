package thuc_hanh.linkedlist;

import org.omg.CORBA.PUBLIC_MEMBER;

public class MyLinkedList {
    private Node head;
    private int numNodes=0;

    public MyLinkedList() {
    }

    private class Node {
        private Node next;

        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }

    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 2 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
    public  void removeMid(int index){
        Node temp = head;
        for (int i = 0; i <index-1 && temp.next !=null ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
