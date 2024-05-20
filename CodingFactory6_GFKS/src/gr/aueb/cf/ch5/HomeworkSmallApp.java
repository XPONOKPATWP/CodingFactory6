package gr.aueb.cf.ch5;

import java.util.Scanner;

public class HomeworkSmallApp {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int choice = 0;
        int n = 0;
            do {
            System.out.println("1. Εμφάνισε n αστεράκια οριζόντια\n");
            System.out.println("2. Εμφάνισε n αστεράκια κάθετα\n");
            System.out.println("3. Εμφάνισε n γραμμές με n αστεράκια\n");
            System.out.println("4. Εμφάνισε n γραμμές με αστεράκια 1 – n\n");
            System.out.println("5. Εμφάνισε n γραμμές με αστεράκια n – 1\n");
            System.out.println("6. Έξοδος από το πρόγραμμα\n");
            System.out.println("Δώσε επιλογή:\n");

            choice=in.nextInt();

        switch (choice){
            default:
                System.out.println("Error");
                break;
            case 1:
                System.out.println("Please provide the number of stars(*): ");
                n = in.nextInt();

                for (int i = 0; i < 10; i++){
                    System.out.print("*");
                }
                break;
            case 2:
                System.out.println("Please provide the number of stars(*): ");
                n = in.nextInt();

                for (int i = 0; i < 10; i++){
                    System.out.println("*");
                }
                break;
            case 3:
                System.out.println("Please provide the number of stars(*): ");
                n = in.nextInt();

                for (int i = 0; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 4:
                System.out.println("Please provide the number of stars(*): ");
                n = in.nextInt();

                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;
            case 5:
                System.out.println("Please provide the number of stars(*): ");
                n = in.nextInt();

                for (int i = n; i >= 1; i--) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 6:
                System.out.println("Exit");
                break;


        }
          }while (choice !=6);

    }
}
