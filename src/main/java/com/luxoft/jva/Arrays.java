package com.luxoft.jva;

import java.util.ArrayList;
import java.util.List;

public class Arrays {
    //psvm to create main method
    public static void main(String[] args) {
        Integer[] ints2 = new Integer[10];
        //int[] numbers = {0,1,2,3,4,5,6,7,8,9};


        final int[] ints = new int[]{1,2,3,4,5,6,7,8};
        ints[0] = 100;
        System.out.println(java.util.Arrays.toString(ints));

        for (int i = 0; i < ints2.length; i++) {
            ints2[i] = i;
        }
        List<Integer> list = java.util.Arrays.asList(ints2);
        System.out.println(list);

        //itar - shortkcut
        for (int i = 0; i < ints.length; i++) {
            int anInt = ints[i];
            System.out.println(anInt);
        }


    }
}
