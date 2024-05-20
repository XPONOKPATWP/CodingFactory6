package gr.aueb.cf.ch3;

import java.util.Scanner;

public class MenuCh3App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int MenuSelectionNumber = 0;

        do {
            System.out.println("1. Εισαγωγή\n");
            System.out.println("2. Διαγραφή\n");
            System.out.println("3. Ενημέρωση\n");
            System.out.println("4. Αναζήτηση\n");
            System.out.println("5. Έξοδος\n");

            MenuSelectionNumber = scanner.nextInt();

            switch (MenuSelectionNumber) {
                case 1:
                    System.out.println("Επιλέξατε Εισαγωγή");
                    break;
                case 2:
                    System.out.println("Επιλέξατε Διαγραφή");
                    break;
                case 3:
                    System.out.println("Επιλέξατε Ενημέρωση");
                    break;
                case 4:
                    System.out.println("Επιλέξατε Αναζήτηση");
                    break;
                case 5:
                    System.out.println("Επιλέξατε Έξοδος");
                    break;
                default:
                    System.out.println("Μη έγκυρη επιλογή");
            }
            System.out.println();
        }while (MenuSelectionNumber !=5);
    }
}
