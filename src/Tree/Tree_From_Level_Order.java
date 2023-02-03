package Tree;
import java.util.*;
public class Tree_From_Level_Order {
    Scanner sc=new Scanner(System.in);

    public class Node{
        int data;
        Node left;
        Node right;
    }

    private Node root;
    public Tree_From_Level_Order(){
        CreateTree();
    }

    private void CreateTree(){
     Queue<Node> q=new LinkedList<>();
     int item=sc.nextInt();
     Node nn=new Node();
     nn.data=item;
     root=nn;
     q.add(nn);

     while(!q.isEmpty()){
         Node rem=q.remove();
         int c1=sc.nextInt();
         if(c1!=-1){
             Node n=new Node();
             n.data=c1;
             rem.left=n;
             q.add(n);
         }
         int c2=sc.nextInt();
         if(c2!=-1) {
             Node n = new Node();
             n.data = c2;
             rem.right = n;
             q.add(n);
         }
     }
    }
    public void PreOrder(){
        PreOrder(this.root);
        System.out.println();
    }

    private void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        Tree_From_Level_Order treeobj=new Tree_From_Level_Order();
        treeobj.PreOrder();
    }
}
