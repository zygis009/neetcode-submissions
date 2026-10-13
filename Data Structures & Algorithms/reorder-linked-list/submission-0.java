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
    public void reorderList(ListNode head) {
        if (head.next == null || head.next.next == null) return;
        // Find middle
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        // Reverse from middle
        ListNode back = null;
        while (slow != null) {
            ListNode tmp = slow;
            slow = slow.next;
            tmp.next = back;
            back = tmp;
        }
        // merge
        while (head.next.next != null) {
            ListNode next = head.next;
            head.next = back;
            back = back.next;
            head = head.next;
            head.next = next;
            head = head.next;
        }
        if (back.next != null) head.next = back;
        return;
    }
}
