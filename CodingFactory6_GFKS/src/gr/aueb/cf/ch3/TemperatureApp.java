package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Διαβάζει απο το standard in ενα ακέραιο
 * που συμβολίζει μια θερμοκρασία και ελέγχει
 * αν η θερμοκρασία είναι μικρότερη απο Θ.
 * Εκτυπώνει το αποτέλεσμα.
 */
public class TemperatureApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0;
        boolean IsTempBelowZero = false;

        System.out.println("Please insert the temperature (Integer)");
        temp = in.nextInt();

        IsTempBelowZero = temp < 0;

        System.out.println("Temp is bellow zero: "+ IsTempBelowZero);
    }
}
