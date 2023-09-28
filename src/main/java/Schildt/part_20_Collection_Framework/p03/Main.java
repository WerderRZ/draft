package Schildt.part_20_Collection_Framework.p03;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");

//        Iterator<String> itr = new al.iterator();
//        while (itr.hasNext()) {
//            String element = itr.next();
//            System.out.print(element + " ");
//        }

        for (String v : al) {
            System.out.println(v);
        }
    }
}
