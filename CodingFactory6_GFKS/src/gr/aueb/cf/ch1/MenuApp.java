package gr.aueb.cf.ch1;

import java.util.Scanner;

public class MenuApp {
    public static void main(String[] args) {
        System.out.println("Μενού");
        System.out.println("Επιλέξτε μία από τις παρακάτω επιλογές:");
        System.out.println("Εισαγωγή");
        System.out.println("Διαγραφή");
        System.out.println("Αναζήτηση");
        System.out.println("Ενημέρωση");
        System.out.println("Έξοδος");
        System.out.println("Δώστε αριθμό επιλογής:");

// δεν ήμουν σίγουρος επειδή λέι "Δώστε αριθμό επιλογής:"και έβαλα scanner και switch
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice){
            case 1: System.out.println("Επιλέξατε Εισαγωγή");
             break;
            case 2: System.out.println("Επιλέξατε Διαγραφή");
             break;
            case 3: System.out.println("Επιλέξατε Αναζήτηση");
             break;
            case 4: System.out.println("Επιλέξατε Ενημέρωση");
             break;
            case 6: System.out.println("Επιλέξατε Έξοδος");
             break;
            default: System.out.println("δεν υπάρχει");
             break;
        }
    }
}
