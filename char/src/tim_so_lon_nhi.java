import java.util.Scanner;

public class tim_so_lon_nhi {
    public static void main(String[] args) {
        double arr[]={2	,3,	5,	8,	9,	23	,45,	7,	14,	45};
        Scanner sc = new Scanner(System.in);

        double max = arr[0];
        for (int i = 1; i <arr.length ; i++) {
           if(arr[i]>max){
               max = arr[i];
           }
        }
        double max2=0;
        if(arr[0]>arr[1]){
            max2 =arr[1];
        }
        else if(arr[0]<arr[1]){
            max2= arr[0];
        }
        else {
            System.out.println("Mang nay ko co phan tu lon thu 2");
        }
        for (int i = 0; i <arr.length ; i++) {
                if(max2<arr[i]){
                    double temp =0;
                    temp = arr[i];
                    if(temp!=max){
                        max2=temp;
                    }
                    System.out.println((i+1)+"    :"+max2);
            }
        }
        System.out.println("-----"+max);
        System.out.println("\nPhan tu lon nha la: "+max2);
    }
}
