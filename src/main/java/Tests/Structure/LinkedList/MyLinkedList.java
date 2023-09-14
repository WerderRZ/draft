package Tests.Structure.LinkedList;

public class MyLinkedList<E> implements MyList<E> {

    private int size = 0;

    private Entry<E> first;

    private Entry<E> last;

    public MyLinkedList() {
    }

    public int size() {
        return size;
    }

    private static class Entry<E> {
        E item;
        Entry<E> next;
        Entry<E> prev;

        Entry(Entry<E> prev, E element, Entry<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }

    public boolean add(E e) {
        Entry<E> lastElement = last;
        Entry<E> newNode = new Entry<>(lastElement, e, null);
        last = newNode;
        if (lastElement == null) {
            first = newNode;
        } else {
            lastElement.next = newNode;
        }
        size++;

        return true;
    }
}
