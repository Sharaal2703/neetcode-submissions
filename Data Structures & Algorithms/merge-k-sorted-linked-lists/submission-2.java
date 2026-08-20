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
    public ListNode mergeKLists(ListNode[] lists) {
        if(lists==null || lists.length==0)
        {
            return null;
        }
        return mergeHelp(lists,0,lists.length-1);

    }
    public ListNode mergeHelp(ListNode lists[],int start,int end)
    {
        if(start==end)
        {
            return lists[start];
        }
        if(start+1==end)
        {
            return merge2(lists[start],lists[end]);
        }
        int mid=(start+end)/2;
        ListNode left=mergeHelp(lists,start,mid);
        ListNode right=mergeHelp(lists,mid+1,end);
        return merge2(left,right);
    }
    public ListNode merge2(ListNode l1,ListNode l2)
    {
        if(l1==null)
        {
            return l2;
        }
        if(l2==null)
        {
            return l1;
        }
        ListNode ans=null;
        ListNode tail=null;
        while(l1!=null && l2!=null)
        {
            ListNode temp=new ListNode();
            if(l1.val<l2.val)
            {
                temp.val=l1.val;
                l1=l1.next;
            }
            else
            {
                temp.val=l2.val;
                l2=l2.next;
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
        if(l1!=null)
        {
            tail.next=l1;
        }
        if(l2!=null)
        {
            tail.next=l2;
        }
        return ans;
    }
}
