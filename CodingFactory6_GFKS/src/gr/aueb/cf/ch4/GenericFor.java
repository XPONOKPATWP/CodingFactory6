package gr.aueb.cf.ch4;

import java.util.Scanner;

/**
 *Γενική μορφή της for.
 */
public class GenericFor {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int StartValue;
        int EndValue;
        int step;
        int iterations = 0;

        System.out.println("Pleease insert, start value, end value, step");
        StartValue = in.nextInt();
        EndValue = in.nextInt();
        step = in.nextInt();
        for (int i = StartValue; i <= EndValue; i = i + step){
            iterations++;
            System.out.print( i + " ");
        }
        System.out.println();
        System.out.println("Iterations: "+ iterations);
    }
}
