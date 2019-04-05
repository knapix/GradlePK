package com.luxoft.jva;

import java.util.Collections;
import java.util.List;

public class ForEach {
    public static void main(String[] args) {
        List<Integer> list = java.util.Arrays.asList(100, 200, 300);
      //  List<Integer> list = java.util.Arrays.asList(100, 200, 300);
       // Collections.sort(ints);
        int[] ints = {100,200,300};
        for(int i : ints) {
            System.out.println(i);
        }
        System.out.println(list);

    }
}
