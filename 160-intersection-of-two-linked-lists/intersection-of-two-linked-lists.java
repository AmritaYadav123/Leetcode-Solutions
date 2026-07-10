/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> s1= new HashSet<>();

        ListNode itr1= headA;
        ListNode itr2= headB;

        while(itr1!=null)
        {s1.add(itr1);
        itr1=itr1.next;}

        while(itr2!=null)
        {if(s1.contains(itr2))
        {return itr2;}
        itr2=itr2.next;}

        return null;
    }
}