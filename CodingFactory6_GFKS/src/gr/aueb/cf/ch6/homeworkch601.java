package gr.aueb.cf.ch6;

public class homeworkch601 {
        public static void main(String[] args) {
            int[] arr = {5, 3, 8, 2, 7, 1, 9};
            int maxPosition = getMaxPosition(arr, 0, arr.length - 1);
            System.out.println("Η θέση του μέγιστου στοιχείου είναι: " + maxPosition);
        }

        public static int getMaxPosition(int[] arr, int low, int high) {
            if (low == high) {
                return low;
            }
            int mid = (low + high) / 2;
            int leftMaxPosition = getMaxPosition(arr, low, mid);
            int rightMaxPosition = getMaxPosition(arr, mid + 1, high);

            if (arr[leftMaxPosition] > arr[rightMaxPosition]) {
                return leftMaxPosition;
            } else {
                return rightMaxPosition;
            }
        }
    }
