/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set= new HashSet<>();

        ListNode itr= head;
        while(itr!=null)
        {if(set.contains(itr))
        {return true;}
        
        set.add(itr);
        itr=itr.next;}
        return false;
    }
}