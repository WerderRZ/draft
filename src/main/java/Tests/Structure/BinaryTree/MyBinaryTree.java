package Tests.Structure.BinaryTree;

import Tests.Structure.LinkedList.SinglyLinkedList;

public class MyBinaryTree {

    private Element root;
    private int size;


    private static class Element {
        int value;
        Element left;
        Element right;

        public Element(int value, Element left, Element right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }
    }

    public void add(int value) {

        Element currentNode = root;

        if (root == null) {
            root = createNewElement(value);
        } else {
            while ((currentNode.left != null) & (currentNode.right != null)) {
                if (value < currentNode.value) {
                    currentNode = currentNode.left;
                } else {
                    currentNode = currentNode.right;
                }
            }

            if (value < currentNode.value) {
                currentNode.left = createNewElement(value);
            } else if(value > currentNode.value) {
                currentNode.right = createNewElement(value);
            }
        }

    }

    private static Element createNewElement(int value) {
        return new Element(value, null, null);
    }

    public void remove(int value) {
        Element currentNode = root;
        Element prevElement = null;

        while (currentNode.value != value) {
            prevElement = currentNode;
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }

        if (currentNode == root) {
            root = null;
        } else {
            Element leftElement = currentNode.left;
            Element rightElement = currentNode.right;

            if (leftElement != null) {
                leftElement.right = rightElement;
            } else if (rightElement != null) {
                rightElement.left = leftElement;
            }
        }


    }

    public boolean isEmpty() {
        return root == null;
    }




}
