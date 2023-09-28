package Training.s7;

public interface IMapWithAllUniquee<K, V> {
    // Три типичных метода Map
    V put(K key, V value);
    V get(K key);
    V remove(K key);

    // true - все V уникальны, false - в противном случае
    // O(1)
    boolean isAllUnique();
}
