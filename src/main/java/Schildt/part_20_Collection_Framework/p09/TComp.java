package Schildt.part_20_Collection_Framework.p09;

import java.util.Comparator;

public class TComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        int i, j, k;
        i = o1.lastIndexOf(' ');
        j = o2.lastIndexOf(' ');

        k = o1.substring(i).compareToIgnoreCase(o2.substring(j));
        if (k == 0) {
            return o1.compareToIgnoreCase(o2);
        } else {
            return k;
        }
    }
}
