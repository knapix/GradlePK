package com.luxoft.jva;

import java.util.Random;

public class Methods {
    public static void main(String[] args) {
        int i = generateRandomInt();
        System.out.println(i);

        int p = sumOfLengths("123", "123456");
        System.out.println(p);



    }
// DO POPRAWY !!
    public static int sumOfLengths(String s1, String s2) {
        return s1.length() + s2.length();
    }

    public static int generateRandomInt() {
        return new Random().nextInt();
    }

    }

