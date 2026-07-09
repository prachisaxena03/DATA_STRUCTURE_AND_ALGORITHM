package Linkedlist;
public class Circular_LL {
    private Node head;
    private Node tail;
    public Circular_LL(){
        this.head=null;
        this.tail=null;
    }
    public void insertFirst(int data){
        Node node=new Node(data);
        if(head== null){
            head=node;
            tail=node;
            return;
        }
        tail.next=node;
        node.next=head;
        tail=node;
    }
    public void display(){
        Node node=head;
        if(head!=null){
            do{
                System.out.print(node.data+"->");
                node=node.next;
            }while(node!=head);
            System.out.println("END");
        }
    }
    public void delete(int data){
        Node node=head;
        if(node==null){
            return;
        }
        if(node.data==data){
            head=head.next;
            tail.next=head;
            return;
        }
        do{
            Node n=node.next;
            if(n.data==data){
                node.next=n.next;
                break;
            }
            node=node.next;
        }while(node!=head);

    }
    private class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;

        }
    }
}
