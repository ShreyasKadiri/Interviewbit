/*

Given a linked list and a value x, partition it such that all nodes less than x come before nodes greater than or equal to x.

You should preserve the original relative order of the nodes in each of the two partitions.

For example,
Given 1->4->3->2->5->2 and x = 3,
return 1->2->2->4->3->5.


*/

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution {
    public ListNode partition(ListNode head, int x) {
    if(head==null)      return null;
        
        ListNode lessDummy= new ListNode(-1);
        ListNode greaterOrEqualDummy= new ListNode(-1);
        ListNode lessIter=lessDummy;
        ListNode greaterOrEqualIter=greaterOrEqualDummy;
        ListNode iter=head;
        
        while(iter!=null)
        {
            if(iter.val<x)
            {
            lessIter.next=iter;
            lessIter=iter;
             }
    
        else if(iter.val>=x)
        {
            greaterOrEqualIter.next=iter;
            greaterOrEqualIter=iter;   
        }
        iter=iter.next;
        greaterOrEqualIter.next=null;
        lessIter.next=greaterOrEqualDummy.next;
        
        }
        
        return lessDummy.next;
    }
}
