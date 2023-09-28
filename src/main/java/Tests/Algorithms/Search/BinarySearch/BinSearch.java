package Tests.Algorithms.Search.BinarySearch;

public class BinSearch {

    public static int BinarySearch(int[] A, int n, int x) {
        int p = 0;
        int r = n - 1;
        while (p <= r) {
            int q = (p + r) / 2;
            if (A[q] == x) {
                return q;
            } else {
                if (A[q] > x) {
                    r = q - 1;
                } else {
                    r = q + 1;
                }
            }
        }
        return -1;
    }

    public static int searchBinary(int[] array, int elementToFind) {
        int startIndex = 0;
        int endIndex = array.length -1;
        int middleIndex;

        while (startIndex <= endIndex) {
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            } else if (array[middleIndex] > elementToFind) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

        return -1;
    }

    public static int searchBinaryRecursive(int[] array, int startIndex, int endIndex, int elementToFind) {
        if (endIndex >= startIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == elementToFind) {
                return middleIndex;
            } else if (array[middleIndex] > elementToFind) {
                return searchBinaryRecursive(array, startIndex, middleIndex - 1, elementToFind);
            } else {
                return searchBinaryRecursive(array, middleIndex + 1, endIndex, elementToFind);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {1, 3, 4, 6, 8, 13, 14, 17, 22};
        int foundElement;
        //foundElement = BinarySearch(array, array.length, 14);
        //foundElement = searchBinaryRecursive(array, 0, array.length - 1, 14);
        foundElement = searchBinary(array, 14);
        System.out.println(foundElement);
    }



}
