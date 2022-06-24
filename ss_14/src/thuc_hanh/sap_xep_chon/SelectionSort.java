package thuc_hanh.sap_xep_chon;

public class SelectionSort {
    static double[] list = {1, 9, 4.5, 6.6, 5.7, -4.5};
    public static void  selectionSort(double[] list){
        for (int i = 0; i <list.length ; i++) {
            int min = i;
            for (int j = i+1; j <list.length ; j++) {
                if(list[j]<list[min]){

                    min=j;
                }
            }
            if(min!=i){
                double temp = list[i];
                list[i] = list[min];
                list[min] = temp;
            }
        }
    }

    public static void main(String[] args) {
        selectionSort(list);
        System.out.println("\nBegin sort processing...");
        for (int i = 0; i < list.length; i++)
            System.out.print(list[i] + " ");
    }

}
