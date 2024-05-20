package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το base^power.
 * ο χρηστής δίνει το base,power.
 */

public class PowerApp {

    public static void main(String[] args) {

        //Δήλωση και αρχικοποίηση μεταβλητών
        Scanner in = new Scanner(System.in);
        int base = 0;
        int power = 0;
        int result = 1;
        int i = 1;

        System.out.println("give the base,power");
        base = in.nextInt();
        power = in.nextInt();

         while (i <= power) {
        result *= base; //result = result * base;
        i++;
         }

             System.out.printf("%d ^ %d = %,d", base, power, result);
    }
}