package Schildt.part_20_Collection_Framework.p08;

import java.util.Comparator;

public class MyComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareTo(o2);
    }
}
