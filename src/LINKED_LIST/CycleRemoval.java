//package LINKED_LIST;
//
//public class CycleRemoval {
//
//    private class Node{
//        int val;
//        Node next;
//    }
//    private Node head;
//    private Node tail;
//    private int size;
//
//    public void addLast(int item){
//        Node nn=new Node();
//        nn.val=item;
//        if(this.size==0){
//            head=nn;
//            tail=nn;
//            size++;
//        }
//        else{
//            tail.next = nn;
//            tail = nn;
//            size++;
//        }
//    }
//
//    public Node mettingPoint(){
//        Node slow=head;
//        Node fast=head;
//        while(fast!=null && fast.next!=null){
//            slow=slow.next;
//            fast=fast.next.next;
//            if(slow==fast){
//                return slow;
//            }
//        }
//        return null;
//    }
//
//    public void Cycleremoval(){
//        Node meet=MeetingPoint();
//        if(meet==null){
//            return;
//        }
//
//        Node temp=meet;
//        int count=1;
//        while(temp.next!=meet){
//            count++;
//            temp=temp.next;
//        }
//
//        Node fast=head;
//        for(int i=1;i<=count;i++){
//            fast=fast.next;
//        }
//        Node slow=head;
//        while(slow.next!=fast.next){
//            slow=slow.next;
//            fast=fast.next;
//        }
//        slow.next=null;
//    }
//}
