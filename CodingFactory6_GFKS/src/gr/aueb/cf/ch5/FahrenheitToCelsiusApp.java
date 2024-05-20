package gr.aueb.cf.ch5;

/**
 * Μετατρέπει βαθμούς Fahrenheit σε Celsius.
 *
 */

public class FahrenheitToCelsiusApp {
    public static void main(String[] args) {
        for (int i = -100; i <= 100;i += 10){
            System.out.printf("%4d\u2109\t=\t%.2f\u2103\n", i, getCelsiusFromFahrenheit(i));
        }
    }

    /**
     * converts Fahrenheit to Celsius.
     * @param FahrenheitDegrees
     *             the input in Fahrenheit degrees.
     * @return
     *              Celsius degrees.
     */
    public static double getCelsiusFromFahrenheit(double FahrenheitDegrees){
        return (FahrenheitDegrees -32)* 5/9;
    }
}
