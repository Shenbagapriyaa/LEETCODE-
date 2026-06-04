// Last updated: 6/4/2026, 1:18:10 PM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode dummy1 = headA, dummy2 = headB;
        while (dummy1 != dummy2) {
            dummy1 = dummy1 != null ? dummy1.next : headB;
            dummy2 = dummy2 != null ? dummy2.next : headA;
        }
        return dummy1;
    }
}