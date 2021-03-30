package calc;

import java.util.Scanner;

public class Calculator {
    public static void main ( String[] args ) {
        Scanner sc = new Scanner (System.in);
        System.out.print ("Enter Number to Get MultiplyTable: ");

        int number = sc.nextInt ();
        for (int i = 1; i <=10 ; i++) {
            System.out.println (number+" * "+i+" = "+number*i);

        }
    }
}
