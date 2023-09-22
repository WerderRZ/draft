package leetcode.easy.p21_merge_two_sorted_lists;

class Solution {

    ListNode list = null;
    ListNode current = null;

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        while (!(list1 == null || list2 == null)) {
            if (list1.val < list2.val) {
                addNodeToList(list1.val);
                list1 = list1.next;
            } else {
                addNodeToList(list2.val);
                list2 = list2.next;
            }
        }

        if (list1 != null) {
            while (list1 != null) {
                addNodeToList(list1.val);
                list1 = list1.next;
            }
        }

        if (list2 != null) {
            while (list2 != null) {
                addNodeToList(list2.val);
                list2 = list2.next;
            }
        }

        return list;
    }

    private void addNodeToList(int value) {

        if (list == null) {
            list = new ListNode(value);
            current = list;
        } else {
            current.next = new ListNode(value);
            current = current.next;
        }

    }

}
