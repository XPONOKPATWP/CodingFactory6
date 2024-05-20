package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Μετράει τους θετικούς αριθμούς που δίνει
 * Ο χρηστής μέχρι να δώσει 0.
 */
public class PositivesCount {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0;
        int positivescount = 0;
        System.out.println("Please insert a num (0 for exit)");
        num = in.nextInt();

        while (num >= 0) {
            positivescount++;
            System.out.println("Please insert a num (0 for exit)");
            num = in.nextInt();
        }

        System.out.println("Positives count: " + positivescount);

    }
}
