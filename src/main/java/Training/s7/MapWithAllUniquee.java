package Training.s7;

import java.util.HashMap;

public class MapWithAllUniquee<K, V> implements IMapWithAllUniquee<K, V> {

    private HashMap<K, V> store = new HashMap<>();
    private HashMap<V, Integer> valueCounters = new HashMap<>();
    private int notuniqueValues = 0;

    @Override
    public V put(K key, V value) {
        int count = valueCounters.getOrDefault(value, 0);
        valueCounters.put(value, count + 1);

        //Если count равен 1, то следующее значение count будет равно 2 (плюс одно неуникальное value)
        if (count == 1) {
            notuniqueValues++;
        }
        return store.put(key, value);
    }

    @Override
    public V get(K key) {
        return store.get(key);
    }

    @Override
    public V remove(K key) {
        V value = store.get(key);
        if (value == null) {
            return null;
        }
        int count = valueCounters.get(value);

        if (count == 1) {
            valueCounters.remove(value);
        } else {
            valueCounters.put(value, count - 1);
        }

        //Если count равен 2, то следующее значение count будет равно 1 (минус одно неуникальное value)
        if (count == 2) {
            notuniqueValues--;
        }
        return store.remove(key);
    }

    // O(1)
    @Override
    public boolean isAllUnique() {
        return notuniqueValues == 0;
    }

    @Override
    public String toString() {
        return store.toString();
    }

}
