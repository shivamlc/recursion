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
            int temp=node.val;//O(1)
            node.val=node.next.val;//O(1)
            node.next.val=temp;//O(1)
            node=node.next.next;//O(1)
            swap(node);
        }
    }
    
    //time complexity of swap(): called n/2 times where n is number of nodes. tc= n/2*O(1)=O(n/2)~=O(n)
    
    public ListNode swapPairs(ListNode head) {
        swap(head);
        return head;
    }
}

Todo: compare performance with iterative method and compute space complexity of recursion method
