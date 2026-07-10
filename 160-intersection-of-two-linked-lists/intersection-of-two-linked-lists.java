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
        Set<ListNode> s2= new HashSet<>();

        ListNode itr1= headA;
        ListNode itr2= headB;

        while(itr1!=null)
        {s1.add(itr1);
        itr1=itr1.next;}

        while(itr2!=null)
        {s2.add(itr2);
        itr2=itr2.next;}

        itr1= headA;
        while(itr1!=null)
        {if(s2.contains(itr1))
        {return itr1;}
        itr1= itr1.next;}

        return null;

    }
}