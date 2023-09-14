package Tests.Structure.Queue;

import Tests.Structure.LinkedList.MyLinkedList;

public class MySimpleQueue<T> implements MyQueue<T> {

    private Node<T> first;

    private Node<T> last;

    private static class Node<T> {
        T item;

        Node<T> prev;
        Node<T> next;

        Node(Node<T> prev, T element, Node<T> next) {
            this.prev = prev;
            this.item = element;
            this.next = next;
        }
    }

    @Override
    public void add(T value) {

        Node<T> lastElement = last;
        Node<T> newNode = new Node<T>(lastElement, value, null);
        last = newNode;
        if (lastElement == null) {
            first = newNode;
        } else {
            lastElement.next = newNode;
        }

    }

    @Override
    public T remove() {
        if (first == null) {
            throw new NullPointerException("Queue is empty");
        }

        Node<T> nextNode = first.next;
        T value = first.item;
        if (nextNode == null) {
            first = null;
            last = null;
        } else {
            first = nextNode;
            first.prev = null;
        }

        return value;
    }

    @Override
    public T getFirst() {
        return first.item;
    }

    @Override
    public T getLast() {
        return last.item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }
}
