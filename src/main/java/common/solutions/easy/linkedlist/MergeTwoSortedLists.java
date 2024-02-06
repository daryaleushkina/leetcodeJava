package common.solutions.easy.linkedlist;

import common.objects.ListNode;

public class MergeTwoSortedLists {
    // Task 21. Merge Two Sorted Lists https://leetcode.com/problems/merge-two-sorted-lists/
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode ans = new ListNode(-1);
        ListNode temp = ans;
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                temp.next = list1;
                list1 = list1.next;
            } else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;

        }
        if (list1 != null) {
            temp.next = list1;
        } else if (list2 != null) {
            temp.next = list2;
        }

        return ans.next;
    }
}
