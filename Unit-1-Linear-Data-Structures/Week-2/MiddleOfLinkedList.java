// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 2
// Problem: Middle of the Linked List
// Platform: LeetCode

class Solution {
    public ListNode middleNode(ListNode head) {       
        ListNode slow = head;
        ListNode fast = head;
        
        while(fast != null && fast.next != null) {
            slow = slow.next;          
            fast = fast.next.next;     
        }        
        return slow;
    }
}
