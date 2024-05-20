package gr.aueb.cf.ch6;
import java.util.Arrays;

public class homeworkch606 {

        public static void main(String[] args) {
            int[][] arr = {{1012, 1136}, {1317, 1417}, {1015, 1020}};
            int maxCars = getMaxCars(arr);
            System.out.println("Ο μέγιστος αριθμός αυτοκινήτων που είναι σταθμευμένα το ίδιο χρονικό διάστημα είναι: " + maxCars);
        }

        public static int getMaxCars(int[][] arr) {
            int[][] timings = new int[arr.length * 2][2];
            int index = 0;

            for (int i = 0; i < arr.length; i++) {
                timings[index][0] = arr[i][0];
                timings[index][1] = 1;
                index++;
                timings[index][0] = arr[i][1];
                timings[index][1] = 0;
                index++;
            }

            Arrays.sort(timings, (a, b) -> a[0] - b[0]);

            int maxCars = 0;
            int currentCars = 0;

            for (int i = 0; i < timings.length; i++) {
                if (timings[i][1] == 1) {
                    currentCars++;
                    maxCars = Math.max(maxCars, currentCars);
                } else {
                    currentCars--;
                }
            }

            return maxCars;
        }
    }
