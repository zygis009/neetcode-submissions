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
    public boolean hasCycle(ListNode head) {
        // Set<ListNode> seen = new HashSet<>();
        // while (head != null) {
        //     if (seen.contains(head)) return true;
        //     seen.add(head);
        //     head = head.next;
        // }
        // return false;
        ListNode next1 = head;
        ListNode next2 = head;
        while (next2 != null && next2.next != null) {
            if (next2.next == next1 || next2.next.next == next1) return true;
            next1 = next1.next;
            next2 = next2.next.next;
        }
        return false;
    }
}
