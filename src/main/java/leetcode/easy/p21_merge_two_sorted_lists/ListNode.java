package leetcode.easy.p21_merge_two_sorted_lists;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class ListNode {

    public int val;
    public ListNode next;

    public ListNode() {
    }

    public ListNode(int x) {
        val = x;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    /**
     * Printing a singly linked list with circularity in mind
     */
    public void printListNode() {

        Set<ListNode> visited = new HashSet<>();
        ListNode node = this;

        StringBuilder res = new StringBuilder();
        res.append("[");
        boolean isCyclic = false;

        while (node != null) {
            if (visited.contains(node)) {
                isCyclic = true;
                break;
            }

            visited.add(node);
            res.append(node.val);
            if (node.next != null) {
                res.append(" -> ");
            }

            node = node.next;
        }

        if (isCyclic) {
            res.append("...");
        }

        res.append("]");
        System.out.println(res);
    }

    /**
     * The method generates a random singly linked list
     * @param nodesCount - required number of nodes of a singly linked list
     * @param min - minimum possible value of the list node
     * @param max - maximum possible value of the list node
     * @param order - a sign of the ordering of nodes in a singly linked list
     * @return
     */
    public static ListNode generateRandomListNode(int nodesCount, int min, int max, Order order) {
        Random random = new Random();
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < nodesCount; i++) {
            int value;
            do {
                value = random.nextInt(max - min + 1) + min;
            } while (set.contains(value));

            set.add(value);

            if (order == Order.ASCENDING) {
                // Inserting the value in sorted order (ascending)
                ListNode newNode = new ListNode(value);
                while (current.next != null && current.next.val < value) {
                    current = current.next;
                }
                newNode.next = current.next;
                current.next = newNode;
                current = dummy;  // Returning the pointer to the beginning of the list
            } else {
                // Just add the value to the end of the list (without ordering)
                current.next = new ListNode(value);
                current = current.next;
            }
        }

        return dummy.next;  // Returning a list without a dummy node
    }

    public enum Order {
        ASCENDING,
        RANDOM
    }

    /**
     * Constructor that allows you to create a singly linked list from array representation: [-10,-3,0,5,9].
     * @param listNodeAsStrArr
     * @return
     */
    public static ListNode ofArrayString(String listNodeAsStrArr) {
        // Remove square brackets from strings and separate elements by comma
        String[] strArray = listNodeAsStrArr.substring(1, listNodeAsStrArr.length() - 1).split(",");

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (String str : strArray) {
            // Convert the string to an integer and create a new node
            int value = Integer.parseInt(str.trim());
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;  // Returning a list without a dummy node
    }
}