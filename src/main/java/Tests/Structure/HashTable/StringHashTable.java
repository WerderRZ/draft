package Tests.Structure.HashTable;

import java.util.Objects;

public class StringHashTable<V> {

    private Entry<V>[] table;
    private int size;
    private final float loadFactor = 0.75F;
    private int threshold;

    private static class Entry<V> {
        final int hash;
        final String key;
        V value;
        Entry<V> next;

        protected Entry(int hash, String key, V value, Entry<V> next) {
            this.hash = hash;
            this.key =  key;
            this.value = value;
            this.next = next;
        }

        public String getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public boolean equals(Object o) {
            if (!(o instanceof Entry<?> e))
                return false;

            return (key == null ? e.getKey() == null : key.equals(e.getKey())) &&
                    (value==null ? e.getValue()==null : value.equals(e.getValue()));
        }

        public int hashCode() {
            return hash ^ Objects.hashCode(value);
        }

        public String toString() {
            return key + "=" + value.toString();
        }

    }

    public StringHashTable() {
        int initialCapacity = 11;
        table = (Entry<V>[]) new Entry<?>[initialCapacity];
        threshold = (int) (initialCapacity * loadFactor);
    }

    public void put(String key, V value) {

        if (value == null) {
            throw new NullPointerException();
        }

        Entry<V>[] tab = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;

        Entry<V> entry = tab[index];
        for(; entry != null ; entry = entry.next) {
            if ((entry.hash == hash) && entry.key.equals(key)) {
                entry.value = value;
                return;
            }
        }

        addEntry(hash, key, value, index);

    }

    private void addEntry(int hash, String key, V value, int index) {
        Entry<V>[] tab = table;
        if (size >= threshold) {
            rehash();

            tab = table;
            hash = key.hashCode();
            index = (hash & 0x7FFFFFFF) % tab.length;
        }

        Entry<V> bucket = tab[index];
        tab[index] = new Entry<>(hash, key, value, bucket);
        size++;
    }

    private void rehash() {
        int oldCapacity = table.length;
        Entry<V>[] oldMap = table;

        // overflow-conscious code
        int newCapacity = (oldCapacity << 1) + 1;
        Entry<V>[] newMap = (Entry<V>[]) new Entry<?>[newCapacity];

        threshold = (int) (newCapacity * loadFactor);
        table = newMap;

        for (int i = oldCapacity - 1; i >= 0 ; i--) {
            Entry<V> old = oldMap[i];
            while (old != null) {
                Entry<V> e = old;
                old = old.next;

                int index = (e.hash & 0x7FFFFFFF) % newCapacity;
                e.next = newMap[index];
                newMap[index] = e;
            }
        }
    }

    public V get(Object key) {
        Entry<V>[] tab = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;
        for (Entry<V> e = tab[index]; e != null ; e = e.next) {
            if ((e.hash == hash) && e.key.equals(key)) {
                return e.value;
            }
        }
        return null;
    }

    public void remove(String key) {
        Entry<V>[] tab = table;
        int hash = key.hashCode();
        int index = (hash & 0x7FFFFFFF) % tab.length;

        Entry<V> e = tab[index];
        for(Entry<V> prev = null; e != null ; prev = e, e = e.next) {
            if ((e.hash == hash) && e.key.equals(key)) {
                if (prev != null) {
                    prev.next = e.next;
                } else {
                    tab[index] = e.next;
                }
                size--;
                e.value = null;
            }
        }

    }

    public void clear() {
        Entry<V>[] tab = table;
        for (int index = tab.length; --index >= 0; )
            tab[index] = null;
        size = 0;
    }

}
