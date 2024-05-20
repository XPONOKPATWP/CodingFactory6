package gr.aueb.cf.ch4;

import java.io.IOException;
import java.util.Scanner;

/**
 * Demo of reading a char.
 * System.in.read() - > int
 */
public class CharReadApp {

    public static void main(String[] args) throws IOException {
        int IntputChar1 = ' ' ;
        char IntputChar2 = ' ' ;
        Scanner in = new Scanner(System.in);

        System.out.println("Please insert ASCII char");
        IntputChar1 = System.in.read();
        System.out.println("Ordinal: "+ IntputChar1);
        System.out.println("char: "+ (char) IntputChar1);

        System.out.println("Please inser a Unicode char");
        IntputChar2 = in.nextLine().charAt(0);
        System.out.println("Unicode Char: "+ IntputChar2);
    }
}
