package Tests.Structure.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class MainLinkedList {
    public static void main(String[] args) {
        testDefault();
        testSinglyLinkedList();
        //testMyLinkedList();
    }

    public static void testDefault() {
        System.out.println("------------");
        System.out.println("test Default Linked List");

        List<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println(list.get(0));

        list.set(1, 15);
        System.out.println(list.get(1));
        System.out.println(list.get(2));

    }

    public static void testSinglyLinkedList() {
        System.out.println("------------");
        System.out.println("test Single Linked List");

        SinglyLinkedList sll = new SinglyLinkedList();
        sll.add(11);
        sll.add(12);
        sll.add(13);
        sll.remove(11);
        System.out.println(sll.get(1));
    }

    public static void testMyLinkedList() {
        MyList<Integer> myList = new MyLinkedList<>();
        myList.add(1);
        myList.add(2);

        //System.out.println(myList.get(0));
    }


}
