package com.luxoft.jva;

import static com.luxoft.jva.MethodOverloading.sum;

public class IfElseStatements {
    public static void main(String[] args) {
        // static int myInt = 5;       //static variabes are not good idea
        //System.out.println(sum(1,2));
        //System.out.println(sum(1L,2));  //for long
        System.out.println(sum(1, 2, 3));

    }

    public static int sum(int i1, int i2) {
        if (i1 < 0) {
            throw new IllegalArgumentException();
        }
        return i1 + i2;
    }

    static int sum(int i1, int i2, int i3) {
        return i1 + i2 + i3;
    }

    //fail
//    static  int sum(int i1, int i2, int i3) {
//        return i1 + i2 + i2;
//    }

    static long sum(long l1, long l2) {
        return l1 + l2;
    }
}

