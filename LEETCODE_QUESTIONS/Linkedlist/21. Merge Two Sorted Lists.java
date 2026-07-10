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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head=new ListNode();
        ListNode last=head;
        while(list1!=null&&list2!=null){
            if(list1.val<=list2.val){
                last.next=list1;
                list1=list1.next;
                last=last.next;
            }else{
                last.next=list2;
                list2=list2.next;
                last=last.next;
            }
        }
         last.next=(list1!=null)?list1:list2;
         return head.next;

    }
}
