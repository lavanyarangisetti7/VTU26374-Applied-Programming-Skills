// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 2
// Problem: Palindrome Linked List
// Platform: LeetCode

class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null)
            return true;
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode prev = null;
        while(slow != null) {
            ListNode nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }
        ListNode first = head;
        ListNode second = prev;
        while(second != null) {
            if(first.val != second.val)
                return false;
            first = first.next;
            second = second.next;
        }
        
        return true;
    }
}
