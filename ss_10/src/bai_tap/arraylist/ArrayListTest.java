package bai_tap.arraylist;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addLast(7);
        arrayList.addFirst(5);
        arrayList.addFirst(6);
        arrayList.addFirst(8);
        arrayList.addFirst(9);

        arrayList.add(3,10);
        arrayList.add(4,12);
        arrayList.remove(4);
        arrayList.remove(3);
        arrayList.printList();
        System.out.println("index = "+arrayList.indexOf(6));
        arrayList.clear();
        System.out.println("Mang sau khi clear:");
        arrayList.printList();
    }
}
