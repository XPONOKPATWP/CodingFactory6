package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *
 */
public class GradesApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int TotalGrades = 0;
        int GradesCount = 0;
        int average = 0;

        System.out.println("Please insert total grades and grades count");
        TotalGrades = scanner.nextInt();
        GradesCount = scanner.nextInt();

        if (GradesCount == 0) {
            System.out.println("Grades count cannot be zero");
        System.exit(1);
        }

        average = TotalGrades / GradesCount;

        if (average < 0 || average > 10) {
            System.out.println("Error. The average is not valid");
        System.exit(1);
        }

        if (average >= 9) {
            System.out.println("Excellent");
        }
        else if (average >= 7) {
            System.out.println("Verry Good");

        }
        else if (average >= 5) {
            System.out.println("Good");
        }
        else {
            System.out.println("Fail");
        }
    }
}
