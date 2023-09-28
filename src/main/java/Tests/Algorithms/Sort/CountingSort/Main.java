package Tests.Algorithms.Sort.CountingSort;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {64, 42, 73, 41, 32, 53, 16, 24, 57, 42, 74, 55, 36};
        countSort(array);
        System.out.println(Arrays.toString(array));
    }

    public static void countSort(int[] array) {
        final int MAX_VALUE = 100;

        int[] count = new int[MAX_VALUE];

        for (int i = 0; i < array.length; i++) {
            count[array[i]] = count[array[i]] + 1;
        }

        int arrayIndex = 0;

        for (int i = 0; i < count.length; i++) {
            for (int j = 0; j < count[i]; j++) {
                array[arrayIndex] = i;
                arrayIndex++;
            }
        }

        
    }
}
