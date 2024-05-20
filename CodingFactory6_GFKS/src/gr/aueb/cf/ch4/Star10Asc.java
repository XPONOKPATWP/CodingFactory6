package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές από
 * αστεράκια σε αύξουσα σειρά,
 * 1η σειρά -> 1 αστεράκι,
 * 2η σειρά -> 2 αστεράκια,
 * Κ.Ο.Κ.
 */
public class Star10Asc {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= i; j++)
                System.out.println("*");
        }
        System.out.println();
    }
}
