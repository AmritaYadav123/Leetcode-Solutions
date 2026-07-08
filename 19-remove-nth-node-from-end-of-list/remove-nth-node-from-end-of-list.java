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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode itr= head;
        int count=0;

        while(itr!=null)
        {count++;
        itr=itr.next;}

        if(count==n)
        {return head.next;}

        ListNode curr= head;
        int prevIndex= count-n-1;

        for(int i=0; i<prevIndex;i++)
        {curr=curr.next;}
        curr.next= curr.next.next;

        return head;
    }
}