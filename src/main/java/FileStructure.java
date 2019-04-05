import org.omg.PortableInterceptor.INACTIVE;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;

public class FileStructure {

   // int weeksNumber = 9;
   // int weekCalculation= 7*24*60*60;


    public static void main(String[] args) {
        int l = 5;
        printLong(l);


        char c = 'a';
        char d = 3000;

        System.out.println("Char c: " + c);
        System.out.println("Char c: " + (int) c);
        System.out.println("Char d: " + d);

        String przemek = "Przemek";
        String marcin = "Marcin";
        System.out.println(przemek);
        System.out.println(marcin);
/*
        System.out.println(new BigDecimal(10).divide(new BigDecimal(3), RoundingMode.CEILING));
        System.out.println(new BigDecimal(2.).pow(32));
        //modulo
        System.out.println(10 % 4);

        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE + 1);
        System.out.println("Max + 1: " + (Integer.MAX_VALUE + 1));
        System.out.println(Byte.MAX_VALUE);
//        main method of my program
        //System.out.println(weeksNumber*weekCalculation);
*/
    }

    private static void printLong(int i) {
        System.out.println(i);
    }

//    int weeks = 9;
//    int day = weeks / 7;
//    int hour = day / 24;
//    int minute = hour / 60;
//    int second = minute / 60;
//


}
