package Linkedlist;
public class linkL {
    private node head;
    private node tail;
    private int size;

    linkL() {
        this.size = 0;
    }

    public  void firstInser(int value) {
        node n=new node(value);
        n.next=head;
        head=n;
        if(tail==null){
            tail=head;
        }
        size++;
    }
    public void display(){
        node temp=head;
        while(temp!=null){
            System.out.print(temp.value +" -> ");
            temp=temp.next;
        }
        System.out.println("END");
    }
    public void insertAtLast(int value){
        if(head==null){
            firstInser(value);
            return;
        }
        node n=new node(value);
        tail.next=n;
        tail=n;
        size++;
    }
    public void delete(int index){
        if(head==null){
            return;
        }
        if(index==0){
            deleteFirst();
            return;
        }
        if(index==size-1){
            lastDelete();
            return;
        }
        node temp=head;
        int count=0;
        for (int i = 0; i < index-1; i++) {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
    public node find(int val){
        node temp=head;
        while(temp!=null){
            if(temp.value==val){
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    public void positionInsert(int value,int index){
        if(index==0){
            firstInser(value);
            return;
        }
        if(index==size-1){
            insertAtLast(value);
            return;
        }
        int count=0;
        node n=new node(value);
        node temp=head;
        while(count < index-1){
            count++;
            temp=temp.next;
        }
        n.next=temp.next;
        temp.next=n;
        size++;
    }
    public void deleteFirst(){
        head=head.next;
        size--;
    }
    public void lastDelete() {
        if (head == null) {
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
            size--;
            return;
        }

        node temp = head;

        while (temp.next != tail) {
            temp = temp.next;
        }

        temp.next = null;
        tail = temp;
        size--;
    }

    private static class node {
        private int value;
        private node next;

        public node(int value) {
            this.value = value;
        }

        public node(int value, node next) {
            this.next = next;
            this.value = value;
        }
    }
}
