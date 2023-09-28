package Tests.Algorithms.Sort.QuickSort;

import java.util.Arrays;

public class Main {

    public static void quickSort(int[] array, int start, int end) {
        if (start >= end) {
            return;
        } else {
            int middle = partition(array, start, end);
            quickSort(array, start, middle - 1);
            quickSort(array, middle + 1, end);
        }
    }

    public static int partition(int[] array, int start, int end) {
        int q = start;
        for (int u = start; u < end; u++) {
            if (array[u] <= array[end]) {
                int temp = array[q];
                array[q] = array[u];
                array[u] = temp;
                q++;
            }
        }

        int temp = array[q];
        array[q] = array[end];
        array[end] = temp;

        return q;
    }

    public static void quickSort2(int[] arr, int from, int to) {
        if (from < to) {
            int divIndex = partition2(arr, from, to);
            quickSort2(arr, from, divIndex -1);
            quickSort2(arr, divIndex, to);
        }
    }

    public static int partition2(int[] arr, int from, int to) {
        int left = from;
        int right = to;

        int pivot = arr[from];
        while (left <= right) {

            while (arr[left] < pivot) {
                left++;
            }

            while (arr[right] > pivot) {
                right--;
            }

            if (left <= right) {
                swap(arr, left, right);
                left++;
                right--;
            }

        }

        return left;
    }

    public static void swap(int[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }


    public static void main(String[] args) {
        int[] array = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
        System.out.println(Arrays.toString(array));
        quickSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));

        System.out.println();

        int[] array2 = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
        System.out.println(Arrays.toString(array2));
        quickSort2(array2, 0, array.length - 1);
        System.out.println(Arrays.toString(array2));
    }
}
