package Tests.Algorithms.Sort.InsertionSort;

import java.util.Arrays;

public class Main {

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int key = array[i];
            int j = i - 1;
            while (j >= 0 && array[j] > key) {
                array[j + 1] = array[j];
                j--;
            }
            array[j + 1] = key;
        }
    }



    public static void main(String[] args) {
        int[] array = {4, 5, 16, 3, 8, 20, 18, 17, 2};
        System.out.println(Arrays.toString(array));
        insertionSort(array);
        System.out.println(Arrays.toString(array));
    }
}
