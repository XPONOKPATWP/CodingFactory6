package gr.aueb.cf.ch6;

/**
 * Returns min position of an array.
 */
public class MinArray2 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        int minPosition;

        minPosition = getMinPosition(arr);
        if (minPosition == -1){
            System.out.printf("Min Value: %d, minPisition: %d,",arr[minPosition], minPosition + 1);
        }

    }

    public static int getMinPosition(int[] arr){
        if (arr == null) return -1;
        int minPosition = -1;
        int min = arr[0];

        for (int i = 0; i < arr.length; i++){
            if (arr[i] < min){
                min = arr[i];
                minPosition = i;
            }
        }
        return minPosition;
    }

    public static int findMax (int[] arr){
        int max = Integer.MIN_VALUE;
        int maxPosition = 0;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] > max){
                max = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
