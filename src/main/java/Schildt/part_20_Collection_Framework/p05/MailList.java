package Schildt.part_20_Collection_Framework.p05;

import java.util.LinkedList;

public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ml = new LinkedList<>();
        ml.add(new Address("J.W. West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ml.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "61853"));
        ml.add(new Address("Tom Carlton", "11 Oak Ave", "Urbana", "IL", "61801"));

        for (Address element:ml) {
            System.out.println(element + "\n");
        }
        System.out.println();

    }
}
