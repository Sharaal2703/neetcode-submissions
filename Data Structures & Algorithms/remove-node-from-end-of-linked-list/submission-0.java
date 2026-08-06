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
    public ListNode delete(ListNode head,int n)
    {
        if(head==null)
        {
            return null;
        }
        if(n==1)
        {
            return head.next;
        }
        else
        {
            int count=1;
            ListNode temp=head;
            ListNode prev=null;
            while(count <n-1 && temp!=null)
            {
                temp=temp.next;
                count++;
            }
            if (temp != null && temp.next != null) 
            {
            temp.next = temp.next.next;
            }
            return head;


        }
        
    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
        System.out.println(head.val);
        head=delete(head,n);
        prev=null;
        curr=head;
        while(curr!=null)
        {
            ListNode next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;

    return head;
    }
}
