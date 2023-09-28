package Tests.Notes.Factorial;

public class Fact {

    public static int getfact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * getfact(n - 1);
        }
    }

    public static void main(String[] args) {
        int number = 4;
        int factorial = getfact(number);
        System.out.println(factorial);
    }






}
