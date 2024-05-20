package gr.aueb.cf.ch2;

/**
 * Template for programming.
 * Πολλαπλασιάζει δυο ακεραίους και εκτυπώνει
 * Το αποτέλεσμα στην κονσόλα.
 */

public class Output2App {
    public static void main(String[] args) {

        //Δήλωση και Αρχικοποίηση μεταβλητών
        int price = 100;
        int quantity = 500;
        int TotalPrice = 0;

        //Εντολές
        TotalPrice = price * quantity;

        //Εκτύπωση Αποτελεσμάτων
        System.out.printf("Price: %3d, Quantity: %d, Total Price: %d\n",price, quantity, TotalPrice);


    }
}
