package gr.aueb.cf.ch2;

import java.util.Scanner;

public class FahrenheitToCelsius {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int fahrenheit = 0;
        int celsius = 0;
        int conversion = 0;

        System.out.println("please include temperature in fahrenheit");
        fahrenheit = in.nextInt();

        celsius = 5 * ( fahrenheit - 32 ) / 9;

        System.out.printf("Fahrenheit: %d equals to Celsius: %d",fahrenheit,celsius);

    }
}
