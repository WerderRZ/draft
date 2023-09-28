package Schildt.part_20_Collection_Framework.p09;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args) {
        TreeMap<String, Double> tm = new TreeMap<>(new TComp());
        tm.put("John Baker", 3434.34);
        tm.put("Tom Smith", 123.22);
        tm.put("Jane Doe", 1378.00);
        tm.put("Tod Hall", 99.22);
        tm.put("Ralph Smith", -19.08);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }


    }
}
