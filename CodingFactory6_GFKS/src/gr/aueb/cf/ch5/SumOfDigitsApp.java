package gr.aueb.cf.ch5;

/**
 * Calculates the sum of the digits of an int.
 * for example the sum of  digits of 571 => 13
 */
public class SumOfDigitsApp {

    public static void main(String[] args) {
        int num = 123456789;
        int SumOfDigits = 0;

        SumOfDigits = getSumOfDigits(num);
        System.out.printf("Sum of digits of %d is %d", num, SumOfDigits);

    }

    /**
     * Returns the sum of digits of the input number.
     *
     * @param num   the input number.
     * @return      the sum of digits of he input num.
     */
    public static int getSumOfDigits(int num){
        int left = num;
        int rightDigit = 0;
        int sum = 0;

        do{
            rightDigit = left % 10;
            sum += rightDigit;
            left = left / 10;
        } while (left != 0);

        return sum;
    }
}
