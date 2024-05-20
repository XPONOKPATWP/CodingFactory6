package gr.aueb.cf.ch4;

import java.util.Scanner;

public class HomeworkGridStars {

        public static void main(String[] args) {

            Scanner in = new Scanner(System.in);
            int n = 0;
            System.out.println("Please provide the number of stars(*): ");
             n = in.nextInt();

            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print("* ");
                }
                System.out.println();
        }
    }
}
