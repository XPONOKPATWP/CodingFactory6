package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει μια θερμοκρασία (ακέραια τιμή) απο το
 * standard in καθώς και μια boolean τιμή που
 * αντιστοιχεί στο αν βρέχει και αποφασίζει αν
 * χιονίζει (βρέχει και θερμοκρασία <0),
 */

public class SnowingApp {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int temp = 0;
        boolean IsRainig = false;
        boolean IsSnowing = false;

        System.out.println("Please insert if is raining");
        IsRainig = in.nextBoolean();

        System.out.println("Please insert outside temperature");
        temp = in.nextInt();

        IsSnowing = IsRainig && (temp < 0);

        System.out.println("Is snowing: " + IsSnowing);
    }
}