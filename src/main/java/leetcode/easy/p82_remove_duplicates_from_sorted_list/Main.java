package leetcode.easy.p82_remove_duplicates_from_sorted_list;

public class Main {
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, null)));
        head.printListNode();

        Solution s = new Solution();
        head = s.deleteDuplicates(head);
        head.printListNode();
    }
}
