package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Λαμβάνει true/false απο το standard in για δυο
 * δεξαμενές. Αν και οι δυο έχουν καύσιμα <1/4 τότε
 * ανάβει κόκκινο. Αν η μια απο τις δυο έχει < 1/4 τότε
 * ανάβει πορτοκαλί ένδειξη
 */

public class TankApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean IsLTQuarterTank1 = false;
        boolean IsLTQuarterTank2 = false;
        boolean IsOrange = false;
        boolean IsRed = false;

        System.out.println("Please insert if tank 1 is lt quarter");
        IsLTQuarterTank1 = in.nextBoolean();

        System.out.println("Please insert if tank 1 is lt quarter");
        IsLTQuarterTank2 = in.nextBoolean();

        IsOrange = IsLTQuarterTank1 ^ IsLTQuarterTank2;
        IsRed = IsLTQuarterTank1 && IsLTQuarterTank2;
    }
}
