package LINKED_LIST;

import java.util.LinkedList;

public class Linked_List {
    private class Node{
        int val;
        Node next;
    }
LinkedList<Integer> ll=new LinkedList<>();
    private Node head;
    private Node tail;
    private int size;
    public void addFirst(int item){
        Node nn=new Node();
        nn.val=item;
        if(this.size==0){
            head=nn;
            tail=nn;
            size++;
        }
        else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int item){
        if(size==0){
            addFirst(item);
        }
        else{
            Node nn = new Node();
            nn.val = item;
            tail.next = nn;
            tail = nn;
            size++;
        }
    }

    public void addAtIndex(int item,int pos) throws Exception{
        if(pos<0 || pos>=size){
            throw new Exception("Abee pagal shi position daal");
        }
        if(pos==0){
            addFirst(item);
        }
        else if(pos==size){
            addLast(item);
        }
        else{
            Node nn=new Node();
            nn.val=item;
            Node node=getNode(pos-1);
            nn.next=node.next;
            node.next=nn;
            size++;
        }
    }

    public int getFirst()
    {
        return head.val;
    }
    public int getLast()
    {
        return tail.val;
    }

    public int getAtIndex(int pos) throws Exception {
        return getNode(pos).val;
    }

    // Deletion

    public int removefirst(){
        Node temp=head;
        if(size==1){
            head=null;
            tail=null;
        }
        else{
            head=head.next;
            temp.next=null;
        }
        size--;
        return temp.val;
    }
    public int removeLast() throws Exception {
        int data;
        if(size==1){
            return removefirst();
        }
        else{
            Node node=getNode(size-2);
            data=tail.val;
            tail=node;
            tail.next=null;
            size--;
        }
        return data;
    }

    public int removeAtIndex(int pos) throws Exception{
        int data=-1;
        if(pos==0){
            removefirst();
        }
        else if(pos==size){
            removeLast();
        }
        else{
            Node prev=getNode(pos-1);
            Node curr=getNode(pos);
            data=curr.val;
            prev.next=curr.next;
            size--;
        }
        return data;
    }

    private Node getNode(int pos) throws Exception{
        if(pos<0 || pos>=size){
            throw new Exception("Abee pagal valid position daal");
        }
        Node temp= head;
        int count=0;
        while(count!=pos){
            temp=temp.next;
            count++;
        }
        return temp;
    }

    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.val+"-->");
            temp=temp.next;
        }
        System.out.println("null");
    }
}
class call{
    public static void main(String[] args) throws Exception {
        Linked_List obj=new Linked_List();
        obj.addFirst(10);
        obj.addFirst(20);
        obj.addFirst(30);
        obj.addFirst(40);
        obj.display();
        obj.addLast(50);
        obj.addLast(60);
        obj.display();
        obj.addAtIndex(25,3);
        obj.display();
        System.out.println(obj.removeAtIndex(2));
        obj.display();
    }
}

