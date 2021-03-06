package bai_tap.linkedlist_product;

public class LinkedList<E> {
    Node head;
    int numsNodes = 0;
    LinkedList(){

    }
    public class Node{
        Node next;
        Object data;
        Node(Object data){
            this.data = data;
        }
        Object getData(){
            return  this.data;
        }
    }
    public void add(int index , E element){

    }
    public void addFirst( E e){
        Node temp = head;
        head = new Node(e);
        head.next = temp;
        numsNodes++;
    }
    public void addLast( E e){
    Node temp =head;
    Node holder;
        for (int i = 0; i <numsNodes && temp.next!=null ; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(e);
        temp.next.next = holder;
        numsNodes++;

    }
    public E remove(int index){
        Node temp = head;
        for (int i = 0; i <index-2 && temp.next!=null ; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        numsNodes--;
        return (E) temp.data;
    }
    public void printList(){
        Node temp= head;
        for (int i = 0; i <numsNodes ; i++) {
            System.out.println(temp.data);
            temp= temp.next;
        }
    }
//    public boolean remove(Object e){
//
//    }
    public  int size(){
        return numsNodes;
    }
//    boolean contains(E e){
//
//    }
//    int indexOf(E o){
//
//    }
}
