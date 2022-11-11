class MinStack {
    Node head;
    
    public MinStack() {
        
    }
    
    public void push(int val) {
        if(head == null) head = new Node(val, val, null);
        else head = new Node(val, Math.min(head.min, val), head); 
    }
    
    public void pop() {
        head = head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}

class Node{
    int val;
    int min;
    Node next;
    
    public Node(int val, int min, Node next) {
        this.val = val;
        this.min = min;
        this.next = next;
    }
}

// https://leetcode.com/problems/min-stack/submissions/
// Runtime: 7 ms, faster than 68.91% of Java online submissions for Min Stack.
// Memory Usage: 48.4 MB, less than 55.05% of Java online submissions for Min Stack.
 
 
