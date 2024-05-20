package gr.aueb.cf.ch3;

/**
 * Υπολογίζει το γινόμενο υοθ 1*2*3*...*10
 * επαναληπτικό τρόπο.
 */

public class Mul10 {

    public static void main(String[] args) {
        int i = 1;
        int mul = 1;

        while (i <= 10) {
            mul = mul * i;
            i++;
        }
    }
}
