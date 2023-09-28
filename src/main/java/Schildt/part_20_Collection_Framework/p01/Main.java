package Schildt.part_20_Collection_Framework.p01;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        System.out.println("Start size al is: " + al.size());

        al.add("C");
        al.add("A");
        al.add("E");
        al.add("B");
        al.add("D");
        al.add("F");
        al.add(1, "A2");

        System.out.println(al.size());

        System.out.println(al);
        al.remove("F");
        al.remove(2);
        System.out.println(al.size());
        System.out.println(al);

        ArrayList<Integer> ali = new ArrayList<>();
        ali.add(1);
        ali.add(2);
        ali.add(3);
        ali.add(4);
        System.out.println(ali);

        Integer[] ia = new Integer[ali.size()];
        ia = ali.toArray(ia);

        int sum = 0;
        for (int i : ia) {
            sum += i;
        }

        System.out.println(sum);

    }
}
