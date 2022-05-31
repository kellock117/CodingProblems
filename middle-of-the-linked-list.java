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
    public ListNode middleNode(ListNode head) {
        ListNode copy = head;
        int count = 0;
        
        while (copy.next != null) {
            copy = copy.next;
            count++;
        }
        
        for (int i = 0; i < (count - 0.5) / 2; i++) {
            head = head.next;
        }
        
        return head;
    }
}

// https://leetcode.com/problems/middle-of-the-linked-list/submissions/
// Runtime: 0 ms, faster than 100.00% of Java online submissions for Middle of the Linked List.
// Memory Usage: 41.6 MB, less than 49.99% of Java online submissions for Middle of the Linked List.
