package Schildt.part_20_Collection_Framework.p08;

import java.util.Comparator;
import java.util.TreeSet;

public class CompDemo {
    public static void main(String[] args) {
        //Comparator<String> mc = (a, b) -> a.compareTo(b);

        //TreeSet<String> ts = new TreeSet<>(new MyComp().reversed());
        TreeSet<String> ts = new TreeSet<>((a,b) -> b.compareTo(a));
        ts.add("C");
        ts.add("A");
        ts.add("B");
        ts.add("E");
        ts.add("F");
        ts.add("D");

        for (String element:ts) {
            System.out.print(element + " ");
        }
        System.out.println();

    }
}
