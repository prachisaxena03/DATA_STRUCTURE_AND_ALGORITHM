package Linkedlist;
public class LL{
    private node head;
    private node tail;
    private int size;
    public LL(){
        this.size=0;
    }
    public void insertFirst(int value){
        node n=new node(value);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size+=1;
    }
    public void insertRec(int data,int index){
       head=insertRec(data,index,head);
    }
    private node insertRec(int data,int index,node no){
        if(index==0){
            node temp =new node(data,no);
            size++;
            return temp;
        }
        no.next=insertRec(data,index-1,no.next);
        return no;
    }
    public node find(int value){
        node n=head;
        while(n!=null){
            if(n.value==value){
                return n;
            }
            n=n.next;
        }
        return null;
    }
    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size-1){
            return deleteLast();
        }
        node position=get(index-1);
        int val=position.next.value;
        position.next=position.next.next;
        return val;
    }
    public void size(){
        System.out.println(size);
    }
    public void display(){
         node temp=head;
         while(temp!=null){
             System.out.print(temp.value+"->");
             temp=temp.next;
         }
        System.out.println("END");
    }
    public void insertLast(int value){
        node n=new node(value);
        tail.next=n;
        tail=n;
        size++;
    }
    public void insertInAfterNode(int value,int index){
        if(index==0){
            insertFirst(value);
            return;
        }
        if(index==size){
            insertLast(value);
            return;
        }
        node temp=head;
        for(int i=1;i<index;i++){
          temp=temp.next;
        }
        node n=new node(value,temp.next);
        temp.next=n;
        size++;
    }
    public int deleteFirst(){
        int val=head.value;
        head=head.next;
        if(head==null){
            tail=null;
        }
        size--;
        return val;
    }
    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        node secondLast=get(size-2);
        int val=tail.value;
        tail=secondLast;
        tail.next=null;
        return val;
    }
    public node get(int index){
        node n=head;
        for (int i = 0; i < index; i++) {
            n=n.next;
        }
        return n;
    }
    private class node{
        private int value;
        private node next;
        public node(int value){
            this.value=value;
        }
        public node(int value,node next){
            this.value=value;
            this.next=next;
        }
    }
}
