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
    public ListNode reverseList(ListNode head) {
        ListNode currNode = head, prevNode = null, nextNode;
        while(currNode != null)
        {
            nextNode = currNode.next;
            currNode.next = prevNode;

            // move the pointer one postion aahead
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }
}
