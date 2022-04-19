/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
class LinkedListCycle {
    public boolean hasCycle(ListNode head) {
        ListNode walker = head;
        ListNode runner = head;
        
        while(runner != null && runner.next != null){
            walker = walker.next;
            runner = runner.next.next;
            
            if(walker == runner)
                return true;
        }
        
        return false;
    }
}

//https://leetcode.com/problems/linked-list-cycle/
//Runtime: 0 ms, faster than 100.00% of Java online submissions for Linked List Cycle.
//Memory Usage: 43.8 MB, less than 81.13% of Java online submissions for Linked List Cycle.