package gr.aueb.cf.ch3;

import java.time.Year;
import java.util.Scanner;

public class LeapYearApp {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int year = 0;
        int LeapYear = 0;
        final int LeapYearDenominator = 4;
        final int NotLeapCenturyDenominator = 100;
        final int LeapCenturyDenominator = 400;
        boolean IsLeapYear = false;

        System.out.println("please insert year");
        year = scanner.nextInt();

        IsLeapYear = (year % LeapYearDenominator == 0 && year % NotLeapCenturyDenominator != 0 || year % LeapCenturyDenominator == 0);

        if (IsLeapYear){
            System.out.println("Leap Year");
        }
        else {
            System.out.println("Normal Year");
        }
    }
}
