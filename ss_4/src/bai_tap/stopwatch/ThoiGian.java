package bai_tap.stopwatch;



import bai_tap.fan.Fan;

import java.util.Arrays;
import java.util.Scanner;

public class ThoiGian {
    public static void main(String[] args) {
        double[] arr = new double[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.floor(Math.random()*10000);
        }

        System.out.println("Before sort");
        System.out.println(Arrays.toString(arr));

        StopWatch s = new StopWatch();
//        Arrays.sort(arr);
        arr(arr);
        s.stop();
        System.out.println("After sort");
        System.out.println(Arrays.toString(arr));
        System.out.println("Thoi gian chay la: "+s.getElapsedTime());
    }

    public static double[] arr (double[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                double temp = 0;
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
