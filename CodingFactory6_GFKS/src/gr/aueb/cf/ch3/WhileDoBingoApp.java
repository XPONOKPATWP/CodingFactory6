package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Bingo app me while ... do.
 */

public class WhileDoBingoApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        final int Secret = 30;
        int num =0;

        while(true) {
            System.out.println("Please insert a num and guess the secret");
            num = scanner.nextInt();

            if (num == Secret) {
                System.out.println("Bingo!!");
                break;
            }else {
                System.out.println("Try again");
            }
        }

        System.out.println("Thank you for playing the game!");
    }
}
