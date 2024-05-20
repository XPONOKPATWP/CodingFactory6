package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογίζει το πλήθος των ψηφίον
 * ακέραιου, με do/while. Για παράδειγμα,
 * αν ο χρήστης δώσει 259 τότε το πλήθος
 * των ψηφίον είναι 3.
 */

public class DigitCount {
    public static void main(String[] args) {

    Scanner in = new Scanner(System.in);
    int num = 0;
    int copyofnum = 0;
    int count = 0;
    int sumofdigits = 0;
    int rhdigit = 0;

        System.out.println("Please insert an int");
        num = in.nextInt();

        copyofnum = num;

            do {
                count++;

                rhdigit = copyofnum % 10;
                sumofdigits += rhdigit;

                copyofnum = copyofnum / 10;
            } while (copyofnum != 0);

        System.out.println("Digit count: " +count);
        System.out.println("Sum of digits: "+ sumofdigits);

        }
    }