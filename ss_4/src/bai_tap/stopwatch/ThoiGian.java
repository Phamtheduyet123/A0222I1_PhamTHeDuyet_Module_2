package bai_tap.stopwatch;

import com.sun.org.apache.xerces.internal.xs.ItemPSVI;

import java.util.Scanner;

public class ThoiGian {
    public static void main(String[] args) {
        double[] arr;
        Scanner sc = new Scanner(System.in);
        arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.random();
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println("a["+(i)+"]"+" = "+arr[i]);
        }
        StopWatch s = new StopWatch();
        s.start();
        arr(arr);
        s.stop();
        System.out.println("Thoi gian chay la: "+s.getElapsedTime());
    }
    public static double[] arr(double[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            double temp = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
    }
