package leetcode.easy.p82_remove_duplicates_from_sorted_list;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        int prevValue = -1000;
        ListNode result = null;
        ListNode current = null;

        while (head != null) {
            if (result == null) {
                result = new ListNode(head.val);
                current = result;
            } else {
                if (prevValue != head.val) {
                    current.next = new ListNode(head.val);
                    current = current.next;
                }
            }

            prevValue = head.val;
            head = head.next;
        }

        return result;
    }
}
