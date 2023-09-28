package Schildt.part_20_Collection_Framework.p02;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("F");
        ll.add("B");
        ll.add("D");
        ll.add("E");
        ll.addLast("Z");
        ll.addFirst("A");
        ll.add(1,"A2");

        System.out.println(ll);
        ll.remove("F");
        ll.remove(2);
        System.out.println(ll);

        ll.removeFirst();
        ll.removeLast();
        System.out.println(ll);



    }
}
