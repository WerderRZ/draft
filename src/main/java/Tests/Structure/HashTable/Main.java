package Tests.Structure.HashTable;

import java.util.Hashtable;

public class Main {
    public static void main(String[] args) {
        Hashtable<Integer, String> ht = new Hashtable<>();
        ht.put(100,"Spongebob");
        ht.put(123, "Patrick");
        ht.put(321, "Sandy");



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
}
