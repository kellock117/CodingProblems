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
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null)
            return head;
        
        ListNode dummy = new ListNode();
        
        ListNode pNode = dummy;
        ListNode cNode = head;
        
        while(cNode != null && cNode.next != null){
            pNode.next = cNode.next;
            cNode.next = pNode.next.next;
            pNode.next.next = cNode;
            
            pNode = cNode;
            cNode = cNode.next;
        }
        
        return dummy.next;
    }
}

//https://leetcode.com/problems/swap-nodes-in-pairs/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
//Memory Usage: 40.1 MB, less than 81.76% of Java online submissions for Swap Nodes in Pairs.