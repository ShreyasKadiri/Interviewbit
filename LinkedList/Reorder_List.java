/**
 * Definition for singly-linked list.
 * class ListNode {
 *     public int val;
 *     public ListNode next;
 *     ListNode(int x) { val = x; next = null; }
 * }
 */
public class Solution 
{
    public ListNode reorderList(ListNode A) 
    {
        if(A==null||A.next==null)
        return A;
        
        int length=getLength(A);
        int count=1;
        ListNode curr = A;
        int end=0;
        
        if(length%2==0)
        end=length/2;
        else
        end=length/2 + 1;
    
        
        while(count<end)
        {
            curr=curr.next;
            count++;
        }
        
        ListNode mid=reverse(curr.next);
        curr.next =null;
        
        curr=A;
        while(mid!=null)
        {
        ListNode t=new ListNode(mid.val);
        t.next=curr.next;
        curr.next=t;
        curr=curr.next.next;
        mid=mid.next;
        }
        return A;
    }
    
    
    
    public ListNode reverse(ListNode A)
    {
    ListNode next=null;
    ListNode prev=null;
    ListNode curr=A;
    while(curr!= null) 
    {
    next=curr.next;
    curr.next=prev;
    prev=curr;
    curr=next;
    }
    return prev;
    }
    
    public int getLength(ListNode A)
    {
    int len=0;
    while(A!=null)
    {
    A=A.next;
    len++;
    }
    return len;
    }
}

