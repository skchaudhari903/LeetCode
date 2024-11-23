/**
You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.
Input: list1 = [1,2,4], list2 = [1,3,4]
Output: [1,1,2,3,4,4]
 */

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        List<Integer> list = new ArrayList<>();
        while(list1 != null)
        {
            list.add(list1.val);
            list1 = list1.next;
        }
        while(list2 != null)
        {
            list.add(list2.val);
            list2 = list2.next;
        }
        Collections.sort(list);
        ListNode temp = new ListNode();
        ListNode head = temp;
        for(int value : list)
        {
            temp.next = new ListNode(value);
            temp = temp.next;
        }
        head = head.next;
        return head;
    }
}
