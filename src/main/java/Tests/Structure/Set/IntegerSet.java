package Tests.Structure.Set;

import java.util.HashMap;

public class IntegerSet {

    private HashMap<Integer,Object> map;

    private static final Object DEF_VALUE = new Object();

    public IntegerSet() {
        map = new HashMap<>();
    }

    public int size() {
        return map.size();
    }

    public boolean isEmpty() {
        return map.isEmpty();
    }

    public boolean add(Integer e) {
        return map.put(e, DEF_VALUE)==null;
    }

    public boolean remove(Integer o) {
        return map.remove(o)==DEF_VALUE;
    }

    public void clear() {
        map.clear();
    }









}
