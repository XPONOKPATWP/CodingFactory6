package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * ο χρηστής μαντεύει ενα μυστικό
 * αριθμό (secret)
 */

public class BingoApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int SECRET = 12;
        int num = 0;
        boolean isbingo = false;

        System.out.println("Please insert a num and guess the secret");
        num = scanner.nextInt();

        do {
            if (num == SECRET) {
                System.out.println("Binfo!!!");
            }
            else {
                System.out.println("Try again");
            }
        }while (!isbingo);

    }
}

