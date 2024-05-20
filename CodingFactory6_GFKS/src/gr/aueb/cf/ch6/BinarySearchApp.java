package gr.aueb.cf.ch6;

import java.util.Arrays;

/**
 * Demo of binary search algorithm that is based
 * in sorted arrays and gives time complexity 0(log(n))
 */
public class BinarySearchApp {

    public static void main(String[] args) {
        int[] arr = {1, 6, 9, 23, 25, 68, 77, 90};
        int value = 68;
        int position;
        int low = 0;
        int high = arr.length -1;
        //position = binarySearch(arr, value, low, high);
        position = Arrays.binarySearch(arr, value);
        System.out.printf("Position: %d, Value: %d", position, arr[position]);
    }

    public static int binarySearch(int[] arr, int value, int low , int high){
        int mid = 0;
        if (arr == null)return -1;
        if (low < 0 || high > arr.length - 1) return -1;
        if (low > high) return -1;

        mid = (low + high) / 2;
        if (arr[mid] == value) return mid;
        if(value > arr[mid]){
            return binarySearch(arr, value, mid + 1, high);
        }else {
            return binarySearch(arr,value,low,mid - 1);
        }
    }
}
