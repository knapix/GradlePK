package com.luxoft.jva;

public class While {
    public static void main(String[] args) {
        int totalCycles = 10;
        int i = 0;
        while (i <totalCycles) {
            i++;
            if (i == 7) {
                continue; //skip and continue. brake - will brake when i=7 and not continue
            }
            System.out.println(i);
        }
    }
}
