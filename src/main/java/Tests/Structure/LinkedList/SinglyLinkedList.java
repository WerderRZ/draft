package Tests.Structure.LinkedList;

import java.util.LinkedList;

public class SinglyLinkedList {

    private Node head;
    private int size;

    public SinglyLinkedList() {
    }

    private class Node {
        public int data;
        public Node next;

        public Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void add(int data) {
        Node newNode = new Node(data);
        Node currentNode = head;

        if (head == null) {
            head = newNode;
        } else {
            while (currentNode.next != null) {
                currentNode = currentNode.next;
            }
            currentNode.next = newNode;
        }
        size++;
    }

    public void remove(int data) {
        if (head == null) {
            return;
        }

        Node currentNode = head;
        Node prevNode = null;

        while (currentNode != null) {
            if (currentNode.data == data) {
                if (currentNode == head) {
                    head = currentNode.next;
                } else {
                    prevNode.next = currentNode.next;
                }
                size--;
                break;
            }
            prevNode = currentNode;
            currentNode = currentNode.next;
        }
    }

    public int size() {
        return size;
    }

    public void clear() {
        // + возможна очистка полей нод
        head = null;
        size = 0;
    }

    public int get(int index) {
        checkIndex(index);
        return getNode(index).data;
    }

    public void set(int index, int value) {
        checkIndex(index);
        Node currentNode = getNode(index);
        currentNode.data = value;
    }

    private Node getNode(int index) {
        Node currentNode = head;
        for (int i = 0; i < index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode;
    }

    private void checkIndex(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("No found index: " + index);
    }

}
