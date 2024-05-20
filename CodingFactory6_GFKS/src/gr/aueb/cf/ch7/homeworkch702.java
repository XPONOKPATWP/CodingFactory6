package gr.aueb.cf.ch7;
import java.util.Scanner;
public class homeworkch702 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Εισάγετε το κρυπτογραφημένο κείμενο που θέλετε να αποκρυπτογραφήσετε: ");
            String encryptedText = scanner.nextLine();
            String decryptedText = decrypt(encryptedText);
            System.out.println("Το αποκρυπτογραφημένο κείμενο είναι: " + decryptedText);
            scanner.close();
        }

        public static String decrypt(String encryptedText) {
            StringBuilder decryptedText = new StringBuilder();
            for (int i = 0; i < encryptedText.length(); i++) {
                char currentChar = encryptedText.charAt(i);
                char decryptedChar = (char) (currentChar - 1);
                decryptedText.append(decryptedChar);
            }
            return decryptedText.toString();
        }
    }
