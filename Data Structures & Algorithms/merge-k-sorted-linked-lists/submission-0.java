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
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode dummy = new ListNode(0);
        ListNode ptr = dummy;
        PriorityQueue<ListNode> minHeap = new PriorityQueue<>(Comparator.comparing(e -> e.val));
        for (ListNode head : lists) {
            if (head != null) {
                minHeap.add(head);
            }
        }
        while (!minHeap.isEmpty()) {
            ptr.next = minHeap.poll();
            ptr = ptr.next;
            if (ptr.next != null) {
                minHeap.add(ptr.next);
            }
        }
        return dummy.next;
    }
}
