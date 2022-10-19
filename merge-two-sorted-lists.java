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
        if(list1 == null) return list2;
        if(list2 == null) return list1;
        
        ListNode answer = new ListNode(0);
        ListNode dummy = answer;
        
        while(list1 != null && list2 != null) {
            if(list1.val <= list2.val) {
                answer.next = new ListNode(list1.val);
                list1 = list1.next;
            }
            else if(list2.val < list1.val) {
                answer.next = new ListNode(list2.val);
                list2 = list2.next;
            }
            
            answer = answer.next;
        }
        
        if(list1 == null) answer.next = list2;
        if(list2 == null) answer.next = list1;
        
        return dummy.next;
    }
}

// https://leetcode.com/problems/merge-two-sorted-lists/submissions/
// Runtime: 1 ms, faster than 82.41% of Java online submissions for Merge Two Sorted Lists.
// Memory Usage: 42.9 MB, less than 63.71% of Java online submissions for Merge Two Sorted Lists.
