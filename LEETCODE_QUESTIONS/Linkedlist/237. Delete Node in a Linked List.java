/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        if(node==null||node.next==null){
            return;
        }
        ListNode current=node;
        current=current.next;
        node.val=current.val;
        node.next=current.next;
    }
}
