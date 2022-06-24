package bai_tap;

public class Optional_BinarySearch {
    static int[] list = {2, 4, 7, 10, 11, 45, 50, 59, 60, 66, 69, 70, 79};
    static int low = 0;
    static int heigth = list.length-1;
    public static int binarySearch(int[] list,int left,int right,int value){
        int lefts = left;
        int rights = right;
        int middle =(lefts+rights)/2;
        if(lefts>rights) {return -1;}

        if(list[middle]==value){
            return middle;
        }
        else if(value > list[middle]){
            lefts = middle+1;
           return binarySearch(list,lefts,rights,value);
        }
        else {

            rights = middle -1;
           return binarySearch(list,lefts,rights,value);
        }
    }

    public static void main(String[] args) {
        System.out.println(binarySearch(list, low,heigth,2));  /* 0 */
        System.out.println(binarySearch(list,low,heigth, 11)); /* 4 */
        System.out.println(binarySearch(list,low,heigth, 79)); /*12 */
        System.out.println(binarySearch(list, low,heigth,1));  /*-1 */
        System.out.println(binarySearch(list,low,heigth, 5));  /*-1 */
        System.out.println(binarySearch(list,low,heigth, 80)); /*-1 */
    }
}
