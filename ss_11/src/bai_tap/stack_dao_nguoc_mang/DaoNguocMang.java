package bai_tap.stack_dao_nguoc_mang;

import java.util.ArrayList;

public class DaoNguocMang<T> {
    Object[] arr;
    ArrayList<T> stack;
    DaoNguocMang(){
        stack = new ArrayList<>();
    }
    public void add(T n){
        stack.add(n);
    }

    void inMangStack(){
        for (T a:stack) {
            System.out.print(a+" ");
        }
//        for (int i = 0; i <stack.size() ; i++) {
//            System.out.println(stack.get(i));
//        }
        }
    public void daoMang(){
        arr  = new Object[stack.size()];
        int i = arr.length-1;
        while (!stack.isEmpty()){
            arr[i] = stack.remove(0);
            i--;
        }
    }
    void printl(){
        for (int i = 0; i <arr.length ; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
