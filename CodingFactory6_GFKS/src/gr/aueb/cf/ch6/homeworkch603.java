package gr.aueb.cf.ch6;
import java.util.Arrays;

public class homeworkch603 {

        public static int searchElement(int[] arr, int target) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == target) {
                    return i;
                }
            }
            return -1;
        }

        public static void printEvenNumbers(int[] arr) {
            System.out.println("Οι ζυγοί αριθμοί του πίνακα είναι:");
            for (int num : arr) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
            System.out.println();
        }

        public static int[] mapToDouble(int[] arr) {
            int[] doubledArray = new int[arr.length];
            for (int i = 0; i < arr.length; i++) {
                doubledArray[i] = arr[i] * 2;
            }
            return doubledArray;
        }

        public static boolean hasPositiveNumber(int[] arr) {
            for (int num : arr) {
                if (num > 0) {
                    return true;
                }
            }
            return false;
        }

        public static boolean allPositiveNumbers(int[] arr) {
            for (int num : arr) {
                if (num <= 0) {
                    return false;
                }
            }
            return true;
        }

        public static void main(String[] args) {
            int[] arr = {5, -3, 8, 0, 7, 1, -9};

            int position = searchElement(arr, 7);
            if (position != -1) {
                System.out.println("Το στοιχείο βρίσκεται στη θέση: " + position);
            } else {
                System.out.println("Το στοιχείο δεν βρέθηκε.");
            }

            printEvenNumbers(arr);

            int[] doubledArr = mapToDouble(arr);
            System.out.println("Ο πίνακας με τα διπλάσια στοιχεία:");
            System.out.println(Arrays.toString(doubledArr));

            System.out.println("Υπάρχει θετικός αριθμός: " + hasPositiveNumber(arr));

            System.out.println("Όλα τα στοιχεία είναι θετικά: " + allPositiveNumbers(arr));
        }
    }
