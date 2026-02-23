// Name: R. Lavanya
// ID: vtu26374
// Subject: 10212CS292 - Applied Programming Skills
// Unit: Unit 1
// Week: Week 2
// Problem: Reverse Nodes in K-Group
// Platform: LeetCode


class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
       if (head == null || k == 1) return head;
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode prevGroupEnd = dummy;
        while (true) {
            ListNode kth = prevGroupEnd;
            for (int i = 0; i < k && kth != null; i++) {
                kth = kth.next;
            }
            if (kth == null) break; 
            ListNode groupStart = prevGroupEnd.next;
            ListNode curr = groupStart.next;
            for (int i = 1; i < k; i++) {
                groupStart.next = curr.next;
                curr.next = prevGroupEnd.next;
                prevGroupEnd.next = curr;
                curr = groupStart.next;
            }
            prevGroupEnd = groupStart;
        }
        return dummy.next;
    }
}
