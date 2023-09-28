package Tests.Algorithms.Sort.MergeSort;

import java.util.Arrays;

public class Main {

    public static void mergeSort(int[] array, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            return;
        } else {
            int q = (startIndex + endIndex) / 2;
            mergeSort(array, startIndex, q);
            mergeSort(array, q+1, endIndex);
            merge(array, startIndex, q, endIndex);
        }

    }

    public static void merge(int[] array, int startIndex, int middleIndex, int endIndex) {
        int n1 = middleIndex - startIndex + 1;
        int n2 = endIndex - middleIndex;

        int[] b = new int[n1 + 1];
        int[] c = new int[n2 + 1];

        for (int i = 0; i < n1; i++) {
            b[i] = array[startIndex + i];
        }
        b[n1] = 1000;

        for (int j = 0; j < n2; j++) {
            c[j] = array[middleIndex + 1 + j];
        }
        c[n2] = 1000;

        int i = 0, j = 0;

        for (int k = startIndex; k <= endIndex; k++) {
            if(b[i] <= c[j]) {
                array[k] = b[i];
                i++;
            } else {
                array[k] = c[j];
                j++;
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = null;
        Arrays.sort(arr);


        int[] array = {12, 9, 3, 7, 14, 11, 6, 2, 10, 5};
        System.out.println(Arrays.toString(array));
        mergeSort(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
