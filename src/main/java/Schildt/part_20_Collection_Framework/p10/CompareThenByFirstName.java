package Schildt.part_20_Collection_Framework.p10;

import java.util.Comparator;

public class CompareThenByFirstName implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.compareToIgnoreCase(o2);
    }
}
