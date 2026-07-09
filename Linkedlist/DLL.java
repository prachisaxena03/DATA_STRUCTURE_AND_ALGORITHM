package Linkedlist;
public class DLL {
    Node head;
    Node tail;
    public void InsertFirst(int data){
        Node node=new Node(data);
        node.next=head;
        node.pre=null;
        if(head!=null) {
            head.pre = node;
        }
        head=node;
    }
    public void display(){
        Node node=head;
        Node last=null;
        while(node!=null){
            System.out.print(node.data+"->");
            last=node;
            node=node.next;
        }
        System.out.println("END");
        System.out.println("print the ll in reverse");
        while(last!=null){
            System.out.print(last.data+"->");
            last=last.pre;
        }

    }
    public void insert(int data,int index){
        Node node=new Node(data);
        Node temp=head;
        if(index==1){
            InsertFirst(data);
        }
        for (int i = 0; i <index; i++) {
            temp=temp.next;
        }
        node.next=temp.next;
        temp.next.pre=node;
        temp.next=node;
        node.pre=temp;

    }
    public void insertLast(int data){
       Node node=new Node(data);
       Node last=head;
       if(head==null){
           node.pre=null;
           head=node;
           return;
       }
       while(last.next!=null){
           last=last.next;
       }
        node.next=null;
        last.next=node;
        node.pre=last;

    }

   private class Node{
        int data;
        Node next;
        Node pre;
        Node(int data){
            this.data=data;
            this.next=null;
            this.pre=null;
        }
        Node(int data,Node next,Node pre){
            this.data=data;
            this.next=next;
            this.pre=pre;
        }
    }
}
