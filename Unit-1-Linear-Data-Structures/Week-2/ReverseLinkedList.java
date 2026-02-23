// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 2
// Problem: Reverse Linked List
// Platform: LeetCode


class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while(curr != null){
            ListNode temp = curr.next;
            curr.next=prev;
            prev=curr;
            curr =temp;
        }
        return prev;
    }
}
