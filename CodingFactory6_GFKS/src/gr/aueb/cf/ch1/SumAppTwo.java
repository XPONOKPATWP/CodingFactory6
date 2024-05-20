package gr.aueb.cf.ch1;

import java.util.Scanner;

public class SumAppTwo {
    public static void main(String[] args) {

 Scanner scanner = new Scanner(System.in);

        System.out.println("Πρώτος Αριθμός");
        int num1 = scanner.nextInt();
        System.out.println("δεύτερος Αριθμός");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        System.out.println("Το αποτέλεσμα της πρόσθεσης είναι ίσο με " + sum);

    }
}
