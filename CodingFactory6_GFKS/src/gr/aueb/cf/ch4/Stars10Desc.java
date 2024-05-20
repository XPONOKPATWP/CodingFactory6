package gr.aueb.cf.ch4;

/**
 * Εκτυπώνει 10 γραμμές με
 * 1η γραμμή -> 10 stars,
 * 2η γραμμή -> 9 stars,
 * Κ.Ο.Κ.
 */
public class Stars10Desc {

    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++){
            for (int j = 1; j <= 10; j++){
                System.out.println("*");
            }
            System.out.println();
        }


    for (int i = 1; i <= 10; i++){
        for (int j = 1; j >= i; j--){
            System.out.println("*");
        }
        System.out.println();
    }
    }
}
