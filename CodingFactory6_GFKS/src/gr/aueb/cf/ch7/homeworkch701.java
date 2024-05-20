package gr.aueb.cf.ch7;
import java.util.Scanner;

public class homeworkch701 {

 public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Εισάγετε το κείμενο που θέλετε να κρυπτογραφήσετε: ");
            String text = scanner.nextLine();
            String encryptedText = encrypt(text);
            System.out.println("Το κρυπτογραφημένο κείμενο είναι: " + encryptedText);
            scanner.close();
        }

        public static String encrypt(String text) {
            StringBuilder encryptedText = new StringBuilder();
            for (int i = 0; i < text.length(); i++) {
                char currentChar = text.charAt(i);
                char encryptedChar = (char) (currentChar + 1);
                encryptedText.append(encryptedChar);
            }
            return encryptedText.toString();
        }
    }
