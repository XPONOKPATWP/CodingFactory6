package gr.aueb.cf.ch2;

import java.util.Scanner;

public class NumbersToDate {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Please provide the numbers");

        int days = 0;
        int months = 0;
        int years = 0;

        days = in.nextInt();
        months = in.nextInt();
        years = in.nextInt();

        System.out.printf("the date is %d/%d/%d",days, months, years);

    }
}
