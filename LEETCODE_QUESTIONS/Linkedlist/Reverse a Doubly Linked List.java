/* Structure of Doubly Linked List Node
class Node {
    int data;
    Node next;
    Node prev;

    Node(int data) {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}
*/
class Solution {
    public Node reverse(Node head) {
        // code here
        if(head==null||head.next==null){
            return head;
        }
        Node temp=head;
        Node newHead=null;
        while(temp!=null){
            Node curr=temp.next;
            temp.next=temp.prev;
            temp.prev=curr;
            newHead=temp;
            temp=temp.prev;
        }
        return newHead;
    }
}
