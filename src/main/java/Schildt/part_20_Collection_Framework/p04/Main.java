package Schildt.part_20_Collection_Framework.p04;

import java.util.ArrayList;
import java.util.Spliterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Double> vals = new ArrayList<>();
        vals.add(1.0);
        vals.add(2.0);
        vals.add(3.0);
        vals.add(4.0);
        vals.add(5.0);

        Spliterator<Double> splitrtr = vals.spliterator();
        while (splitrtr.tryAdvance((n) -> System.out.println(n)));
        System.out.println();

        splitrtr = vals.spliterator();
        ArrayList<Double> sqrs = new ArrayList<>();
        while (splitrtr.tryAdvance((n) -> sqrs.add(Math.sqrt(n))));

        splitrtr = sqrs.spliterator();
        splitrtr.forEachRemaining((n) -> System.out.println(n));
        System.out.println();




    }
}
