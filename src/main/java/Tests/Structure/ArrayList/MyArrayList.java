package Tests.Structure.ArrayList;

import java.util.Arrays;

public class MyArrayList<E> {

    private int size;

    private Object[] elementData;

    private static final Object[] DEFAULT_ARRAYLIST = {};

    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        this.elementData = DEFAULT_ARRAYLIST;
    }

    public boolean add(E value) {
        if (size == elementData.length) {
            elementData = grow();
        }
        elementData[size] = value;
        size++;

        return true;
    }

    private Object[] grow() {
        int oldCapacity = elementData.length;
        if (oldCapacity > 0) {
            int newCapacity = oldCapacity + (oldCapacity >> 1);
            return elementData = Arrays.copyOf(elementData, newCapacity);
        } else {
            return elementData = new Object[DEFAULT_CAPACITY];
        }
    }

    public E get(int index) {
        checkIndex(index, size);
        return elementData(index);
    }

    private static void checkIndex(int index, int size) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Not found index in array: " + index);
        }
    }

    public E set(int index, E element) {
        checkIndex(index, size);
        E oldValue = (E) elementData(index);
        elementData[index] = element;
        return oldValue;
    }

    E elementData(int index) {
        return (E) elementData[index];
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public E remove(int index) {
        checkIndex(index, size);
        final Object[] es = elementData;

        @SuppressWarnings("unchecked") E oldValue = (E) es[index];
        fastRemove(es, index);

        return oldValue;
    }

    private void fastRemove(Object[] es, int i) {
        final int newSize = size - 1;
        if (newSize > i) {
            System.arraycopy(es, i + 1, es, i, newSize - i);
        }
        es[size = newSize] = null;
    }

}
