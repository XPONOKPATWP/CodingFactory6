package gr.aueb.cf.ch2;

/**
 * ΕΕπιδεικνυει τις μετατροπές μεταξύ
 * διαφορετικών τύπων δεδομένων.
 */
public class TypecastApp {

    public static void main(String[] args) {

        int MyInt = 10;
        long MyLong = 20L;
        int MyResultInt = 0;
        long MyResultLong = 0L;

        MyLong = MyInt; // auto-widening auto Typecast
        MyInt =(int) MyLong; // Typecast

        MyResultInt = MyInt + (int) MyLong;
        MyResultLong = MyInt * MyLong;
        MyResultLong = MyInt;
    }
}
