package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Ο χρήστης εισάγει δύο ακεραίους μέχρι
 * ο αριθμητής να είναι μηδέν.
 * Το πρόγραμμα ελεγχει τον παρανομαστη αν ειναι
 * 0. και αν ειναι 0 δινει το δυνατοτητα στο χρηστη
 * να σθνεχισει δινοντας παρανομαστη διαφορο του μηδενος.
 */

public class WhileDoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int numerator = 0;
        int denominator = 0;
        int result = 0;

        while (true) {
            System.out.println("Please insert two inegers for division (numerator 0 for exit)");
            numerator = scanner.nextInt();
            denominator = scanner.nextInt();

            if (numerator == 0) {
                System.out.println("Numerator is zero");
                break;
            }

            if (denominator == 0) {
                System.out.println("Denominator should not be zero");
                continue;
            }

            result = numerator / denominator;
            System.out.printf("%d / %d = %d", numerator, denominator = result);

        }
        System.out.println("Thanks for using our app!");
    }

}
