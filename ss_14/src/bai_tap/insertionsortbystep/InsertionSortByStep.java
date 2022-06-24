package bai_tap.insertionsortbystep;

public class InsertionSortByStep {
        static int[] list = {12, 3, 8, 5, 4, 7, 9, 10, 23, 1};

        public static void insertionSort(int[] list) {
            int x, pos;
            for (int i = 1; i < list.length; i++) {
                pos = i;
                x = list[i];
                while (pos > 0 && x < list[pos-1]) {
//                list[pos] = list[pos-1]; // đổi chỗ
                    /* Swap list[i] with list[i + 1] */
                    System.out.println("Swap " + list[pos] + " with " + list[pos-1]);
                    int temp = list[pos-1];
                    list[pos-1]=list[pos];
                    list[pos]= temp;
                    pos--;
                }
//            list[pos] = x;
                /* Show the list after sort */
                System.out.print("List after the  " + i+ "' sort: ");
                for (int j = 0; j < list.length; j++) {
                    System.out.print(list[j] + "\t");
                }
                System.out.println();
            }

        }

        public static void main(String[] args) {
            System.out.print("Your input list: ");
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
            System.out.println("\nBegin sort processing...");
            insertionSort(list);
            for (int i = 0; i < list.length; i++) {
                System.out.print(list[i] + "\t");
            }
        }
    }
