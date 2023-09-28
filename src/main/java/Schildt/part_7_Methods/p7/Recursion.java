package Schildt.part_7_Methods.p7;

public class Recursion {
    public static void main(String[] args) {
        Factorial f = new Factorial();

        System.out.println(f.fact(3));
        System.out.println(f.fact(4));
        System.out.println(f.fact(5));

        //"test".replace()
        StringBuilder sb = new StringBuilder("test");
        sb.setCharAt(1, 'o');

    }

}
