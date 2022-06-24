package bai_tap.insertionsort;

public class InsertionSort {
    static int[] list = {12, 3, 8, 5, 4, 7, 9, 10, 23, 1};

    public static void insertionSort(int[] list) {
        int x, pos;
        for (int i = 1; i < list.length; i++) {
            pos = i;
            x = list[i];
            while (pos > 0 && x < list[pos-1]) {
//                list[pos] = list[pos-1]; // đổi chỗ
                int temp = list[pos-1];
                list[pos-1]=list[pos];
                list[pos]= temp;
                pos--;
            }
//            list[pos] = x;
        }
    }

    public static void main(String[] args) {
        System.out.println("\nBegin sort processing...");
        insertionSort(list);
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + "\t");
        }
    }
}
