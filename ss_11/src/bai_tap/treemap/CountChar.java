package bai_tap.treemap;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class CountChar {
    public static void main(String[] args) {
        String stTest = "Hello World";
        TreeMap<Character, Integer> treeMap = new TreeMap<>();
        String[] arr = stTest.split("");
        for (int i = 0; i < arr.length; i++) {
            int count = 1;
            if (treeMap.containsKey(arr[i].charAt(0))) {
                count += treeMap.get(arr[i].charAt(0));
            }
            treeMap.put(arr[i].charAt(0), count);
        }
        for (Map.Entry<Character, Integer> s: treeMap.entrySet()) {
            System.out.println(s);
        }
    }
}

