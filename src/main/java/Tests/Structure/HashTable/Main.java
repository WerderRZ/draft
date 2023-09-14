package Tests.Structure.HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {

        //testHashTable();
        //testMyHashTable();
        testStringHashTable();

    }

    public static void testHashTable() {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(100,"Spongebob");
        ht.put(123, "Patrick");
        ht.put(321, "Sandy");
    }

    public static void testMyHashTable() {
        MyHashTable<Integer, String> mht = new MyHashTable<>();
        mht.put(100,"Spongebob");
        mht.put(123, "Patrick");
        mht.put(321, "Sandy");
        mht.put(555, "Squidward");
        mht.put(777, "Garry");
        mht.put(159, "Crabs");
        mht.put(332, "Plankton");
        mht.put(815, "Bob");

        //rehash
        mht.put(819, "Jack");

        System.out.println(mht.get(123));
        mht.remove(123);
    }

    public static void testStringHashTable() {
        StringHashTable<Integer> stringHT = new StringHashTable<>();

        stringHT.put("Bob", 13);
        stringHT.put("Alex", 15);
        stringHT.put("Sam", 27);
        stringHT.put("Ivan", 16);
        stringHT.put("Boris", 67);
        stringHT.put("Teresa", 17);
        stringHT.put("Donald", 20);
        stringHT.put("John", 12);

        stringHT.put("Lesley", 51);

        System.out.println(stringHT.get("Teresa"));

        stringHT.remove("Boris");
        stringHT.clear();

    }
}
