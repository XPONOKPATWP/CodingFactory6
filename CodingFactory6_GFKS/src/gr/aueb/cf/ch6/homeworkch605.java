package gr.aueb.cf.ch6;

public class homeworkch605 {
        public static void main(String[] args) {
            int[] arr = {0, 1, 4, 4, 4, 6, 7, 8, 8, 8, 8, 8};
            int key = 8;
            int[] result = getLowAndHighIndexOf(arr, key);
            System.out.println("Low index: " + result[0]);
            System.out.println("High index: " + result[1]);
        }

        public static int[] getLowAndHighIndexOf(int[] arr, int key) {
            int[] result = new int[2];
            result[0] = -1;
            result[1] = -1;

            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key) {
                    result[0] = i;
                    break;
                }
            }

            if (result[0] != -1) {
                for (int i = result[0]; i < arr.length; i++) {
                    if (arr[i] != key) {
                        result[1] = i - 1;
                        break;
                    } else if (i == arr.length - 1) {
                        result[1] = i;
                    }
                }
            }

            return result;
        }
    }
