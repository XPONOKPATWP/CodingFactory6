package gr.aueb.cf.ch6;
import java.util.Scanner;

public class homeworkch604 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            int[] numbers = new int[6];
            System.out.println("Εισάγετε έξι ακέραιους αριθμούς από το 1 έως το 49:");
            for (int i = 0; i < 6; i++) {
                numbers[i] = scanner.nextInt();
            }

            System.out.println("Οι αριθμοί που εισήχθησαν είναι:");
            for (int num : numbers) {
                System.out.print(num + " ");
            }
            System.out.println();

            if (checkFilters(numbers)) {
                System.out.println("Η εξάδα περνά από όλα τα φίλτρα.");
            } else {
                System.out.println("Η εξάδα δεν περνά από όλα τα φίλτρα.");
            }

            scanner.close();
        }

        public static boolean checkFilters(int[] numbers) {
            return checkEvenOdd(numbers) &&
                    checkConsecutive(numbers) &&
                    checkSameLastDigit(numbers) &&
                    checkSameDecade(numbers);
        }

        public static boolean checkEvenOdd(int[] numbers) {
            int evenCount = 0;
            int oddCount = 0;
            for (int num : numbers) {
                if (num % 2 == 0) {
                    evenCount++;
                } else {
                    oddCount++;
                }
            }
            return evenCount <= 3 && oddCount <= 3;
        }

        public static boolean checkConsecutive(int[] numbers) {
            for (int i = 0; i < numbers.length - 2; i++) {
                if (numbers[i] == numbers[i + 1] - 1 && numbers[i + 1] == numbers[i + 2] - 1) {
                    return false;
                }
            }
            return true;
        }

        public static boolean checkSameLastDigit(int[] numbers) {
            int[] lastDigits = new int[10];
            for (int num : numbers) {
                lastDigits[num % 10]++;
            }
            for (int count : lastDigits) {
                if (count > 3) {
                    return false;
                }
            }
            return true;
        }

        public static boolean checkSameDecade(int[] numbers) {
            int[] decades = new int[5];
            for (int num : numbers) {
                decades[num / 10]++;
            }
            for (int count : decades) {
                if (count > 3) {
                    return false;
                }
            }
            return true;
        }
    }

