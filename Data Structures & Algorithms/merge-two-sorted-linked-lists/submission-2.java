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
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode m1=l1;
        ListNode m2=l2;
        ListNode ans=null;
        ListNode tail=null;
        while(m1!=null && m2!=null)
        {
            ListNode temp=new ListNode();
            if(m1.val<m2.val)
            {
                temp.val=m1.val;
                m1=m1.next;
            }
            else
            {
                temp.val=m2.val;
                m2=m2.next;
            }
            if(ans==null)
            {
                ans=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }


        }
        while(m1!=null)
        {
            ListNode temp=new ListNode();
            temp.val=m1.val;
            if(ans==null)
            {
                ans=temp;
                tail=temp;
            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
            m1=m1.next;

        }
        while(m2!=null)
        {
            ListNode temp=new ListNode();
            temp.val=m2.val;
            if(ans==null)
            {
                ans=temp;
                tail=temp;

            }
            else
            {
                tail.next=temp;
                tail=temp;
            }
            m2=m2.next;
        }
        return ans;
        // ListNode merge1=list1;
        // ListNode merge2=list2;
        // ListNode ans=null;
        // ListNode tail=null;
        // while(merge1!=null && merge2!=null)
        // {
        //     ListNode temp=new ListNode();
        //     if(merge1.val<merge2.val)
        //     {
        //         temp.val=merge1.val;
        //         merge1=merge1.next;   
        //     }
        //     else
        //     {
        //         temp.val=merge2.val;
        //         merge2=merge2.next;
        //     }
        //     if(ans==null)
        //     {
        //         ans=temp;
        //         tail=temp;
        //     }
        //     else
        //     {
        //         tail.next=temp;
        //         tail=temp;
        //     }
        // }
        // while(merge1!=null)
        // {
        //     ListNode temp=new ListNode();
        //     temp.val=merge1.val;
        //     if(ans==null)
        //     {
        //         ans=temp;
        //         tail=temp;
        //     }
        //     else
        //     {
        //         tail.next=temp;
        //         tail=temp;
        //     }
        //     merge1=merge1.next;
                
        // }
        // while(merge2!=null)
        // {
        //     ListNode temp=new ListNode();
        //     temp.val=merge2.val;
        //     if(ans==null)
        //     {
        //         ans=temp;
        //         tail=temp;
        //     }
        //     else
        //     {
        //         tail.next=temp;
        //         tail=temp;
        //     }
        //     merge2=merge2.next;
                
        // }
        // return ans;


        
    }
}