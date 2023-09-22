package leetcode.easy.p21_merge_two_sorted_lists;

public class Main {
    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
    //    ListNode list1 = null;
    //    ListNode list2 = null;

        list1.printListNode();
        list2.printListNode();

        Solution s = new Solution();
        ListNode list3 = s.mergeTwoLists(list1, list2);
        list3.printListNode();






    }
}
