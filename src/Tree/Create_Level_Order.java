package Tree;
import java.util.*;
public class Create_Level_Order {
    public class Node{
        int val;
        Node left;
        Node right;
    }
    private Node root;
    Scanner sc=new Scanner(System.in);

    public Create_Level_Order(){
        this.root=CreateTree();
    }
    private Node CreateTree(){
        Queue<Node> q=new LinkedList<>();
        Node nn=new Node();
        int val=sc.nextInt();
        nn.val=val;
        root=nn;
        q.add(root);
        while(!q.isEmpty()){
            Node rem=q.remove();
            int c1=sc.nextInt();
            int c2=sc.nextInt();
            if(c1!=-1){
                Node node=new Node();
                node.val=c1;
                rem.left=node;
                q.add(node);
            }
            if(c2!=-1){
                Node node=new Node();
                node.val=c2;
                rem.right=node;
                q.add(node);
            }
        }
        return root;
    }
    public void PreOrder(){

        PreOrder(root);
    }
    private void PreOrder(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.val+" ");
        PreOrder(root.left);
        PreOrder(root.right);
    }

    public static void main(String[] args) {
        Create_Level_Order cl=new Create_Level_Order();
        cl.PreOrder();
    }
}
