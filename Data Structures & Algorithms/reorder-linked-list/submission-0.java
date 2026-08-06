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
    public void reorderList(ListNode head) {
        if(head==null || head.next==null)
        {
            return;
        }
        ListNode mid=null;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        mid=slow;

        ListNode l2=mid.next;
        mid.next=null;
        ListNode prev=null;
        ListNode curr=l2;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        
        l2=prev;
        System.out.println(l2.val);
        System.out.println(mid.val);
        ListNode ans;
        ListNode l1=head;
        while(l2!=null)
        {
            ListNode temp1=l1.next;
            ListNode temp2=l2.next;
            l1.next=l2;
            l2.next=temp1;
            l1=temp1;
            l2=temp2;

        }
        
    }
}
