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
    
    void swap(ListNode node)
    {
        if(node==null||node.next==null)
            return;
        else{
            int temp=node.val;
            node.val=node.next.val;
            node.next.val=temp;
            node=node.next.next;
            swap(node);
        }
    }
    
    public ListNode swapPairs(ListNode head) {
        swap(head);
        return head;
    }
}
