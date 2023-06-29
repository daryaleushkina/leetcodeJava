package common.solutions.easy.array;

import common.objects.ListNode;

import java.util.ArrayList;

public class MergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        ListNode temp = list1;
        while (temp != null) {
            arr1.add(temp.val);
            temp = temp.next;
        }
        temp=list2;
        while (temp != null) {
            arr2.add(temp.val);
            temp = temp.next;
        }
        arr1.addAll(arr2);
        arr1.stream().sorted();
        ListNode ans = null;

        for (int i = 0;i<arr1.size();i++)
            ans.val = arr1.get(i);
        return ans;
    }
}
