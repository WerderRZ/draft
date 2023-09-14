package Tests.Structure.Stack;

public class MySimpleStack<T> implements MyStack<T> {
    private Node<T> last;

    private static class Node<T> {
        T item;
        Node<T> prev;

        Node(Node<T> prev, T element) {
            this.item = element;
            this.prev = prev;
        }
    }

    @Override
    public void push(T value) {
        Node<T> lastNode = last;
        last = new Node<>(lastNode, value);
    }

    @Override
    public T pop() {
        if (last == null) {
            throw new NullPointerException("Stack is empty");
        }

        Node<T> prevNode = last.prev;
        if (prevNode == null) {
            last = null;
        } else {
            T value = last.item;
            last = prevNode;
            return value;
        }

        return null;
    }

    @Override
    public T getLast() {
        return last.item;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

}
