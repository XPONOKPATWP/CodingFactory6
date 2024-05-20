package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Τα φώτα ενός αυτοκίνητου ανάβουν όταν
 * βρέχει και ταυτόχρονα είτε είναι σκοτάδι
 * η τρέχει με ταχύτητα υψηλή ο χρήστης εισάγει
 * τα τρία παραπάνω στοιχεία και το πρόγραμμα εκτυπώνει
 * αν τα φωτά ανάβουν η οχι
 */

public class LightsOnApp {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int speed = 0;
        boolean  IsSpeeding = false;
        boolean IsDark = false;
        boolean IsRaining = false;
        final int SPEED_LIMIT = 100;
        boolean AreLightsOn = false;

        System.out.println("Is it raining");
        IsRaining = in.nextBoolean();

        System.out.println("Is it dark");
       IsDark =  in.nextBoolean();

        System.out.println("what's the speed of the vehicle" + speed);
        speed = in.nextInt();

        IsSpeeding = speed > SPEED_LIMIT;
        AreLightsOn = IsRaining && (IsSpeeding || IsDark);
        System.out.println("the lights are on: " +AreLightsOn);



    }
}
