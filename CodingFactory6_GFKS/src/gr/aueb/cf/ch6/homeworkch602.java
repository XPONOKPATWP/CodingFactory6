package gr.aueb.cf.ch6;

public class homeworkch602 {
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 2, 7, 1, 9};
            int secondSmallest = findSecondSmallest(arr);
            System.out.println("Το δεύτερο μικρότερο στοιχείο είναι: " + secondSmallest);
        }

        public static int findSecondSmallest(int[] arr) {
            if (arr.length < 2) {
                System.out.println("Ο πίνακας πρέπει να έχει τουλάχιστον δύο στοιχεία.");
                return Integer.MIN_VALUE;
            }

            int smallest = Integer.MAX_VALUE;
            int secondSmallest = Integer.MAX_VALUE;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < smallest) {
                    secondSmallest = smallest;
                    smallest = arr[i];
                } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                    secondSmallest = arr[i];
                }
            }

            return secondSmallest;
        }
    }
