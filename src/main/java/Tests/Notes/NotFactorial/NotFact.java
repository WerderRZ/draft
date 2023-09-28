package Tests.Notes.NotFactorial;

public class NotFact {

    public static int RecursiveLinearSearch(int A[], int n, int i, int x) {
        if (i <= n) {
            if (A[i] == x) {
                return i;
            } else {
                return RecursiveLinearSearch(A, n, i + 1, x);
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 3, 5, 1, 6};
        int found = RecursiveLinearSearch(array, array.length - 1, 0, 3);
        System.out.println(found);
    }

}
