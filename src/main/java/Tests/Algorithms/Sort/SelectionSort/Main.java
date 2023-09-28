package Tests.Algorithms.Sort.SelectionSort;

import java.util.Arrays;

public class Main {

    public static void selectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[smallest]) {
                    smallest = j;
                }
            }
            int temp = array[i];
            array[i] = array[smallest];
            array[smallest] = temp;
        }

    }

    public static void main(String[] args) {
        int[] array = {4, 5, 16, 3, 8, 20, 18, 17, 2};
        System.out.println(Arrays.toString(array));
        selectionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
