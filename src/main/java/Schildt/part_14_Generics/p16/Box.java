package Schildt.part_14_Generics.p16;

import java.util.ArrayList;

public class Box<V, K> {
    private V value;
    public K key;

    public void setValue(V value) {
        this.value = value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public V getValue() {
        return value;
    }

    public K getKey() {
        return key;
    }

    public static void main(String[] args) {
        Box<String, Integer> box = new Box<>();
        box.setValue("Test string");
        box.setKey(15);
        System.out.println(box.getValue() + ": " + box.key);

    }
}
