package thuc_hanh.linkedlist;

import java.util.LinkedList;
import java.util.List;

public class MyLinkedListTest {
    public static void main(String[] args) {
            System.out.println("/=/=/=/= TESTING /=/=/=/=");
            MyLinkedList ll = new MyLinkedList();
            ll.addFirst("abc");
            ll.addFirst(12);
            ll.addFirst(13);
            ll.printList();
            System.out.println("-----------------");
           ll.add(2,99);
            ll.printList();
            System.out.println("-----------------");
            ll.add(9,88);

            ll.printList();


            LinkedList<Integer> list = new LinkedList<>();
        list.addFirst(11);
        list.addFirst(12);
        list.addFirst(13);
      
    }
}
