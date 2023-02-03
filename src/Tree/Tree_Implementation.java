package Tree;
import java.util.*;

public class Tree_Implementation {
    private class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    Scanner sc=new Scanner(System.in);
    public void Binary_Tree(){
        this.root=CreateTree();
    }

    private Node CreateTree(){
        int item=sc.nextInt();
        Node nn=new Node();
        nn.val=item;
        boolean hasLeftChild=sc.nextBoolean();
        if(hasLeftChild){
            nn.left=CreateTree();
        }
        boolean hasRightChild=sc.nextBoolean();
        if(hasRightChild){
            nn.right=CreateTree();
        }
        return nn;
    }

    public void display(){
        display(this.root);
    }

    private void display(Node root){
        if(root==null){
            return;
        }
        String s="";
        s="<--"+s+root.val+"-->";
        if(root.left!=null){
            s=root.left.val+s;
        }
        else{
            s="."+s;
        }

        if(root.right!=null){
            s=s+root.right.val;
        }
        else{
            s=s+'.';
        }
        System.out.println(s);
        display(root.left);
        display(root.right);
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

    public void PostOrder(){
        PostOrder(root);
    }

    private void PostOrder(Node root){
        if(root==null){
            return;
        }
        PostOrder(root.left);
        PostOrder(root.right);
        System.out.print(root.val+" ");
    }

    public void InOrder(){
        InOrder(root);
    }
    private void InOrder(Node root){
        if(root==null){
            return;
        }
        InOrder(root.left);
        System.out.print(root.val+" ");
        InOrder(root.right);
    }

    public boolean Search(int item){
        return Search(root,item);
    }

    private boolean Search(Node root,int item){
        if(root==null){
            return false;
        }
        if(root.val==item){
            return true;
        }

        return Search(root.left,item) || Search(root.right,item);
    }
    public int Max(){
        return Max(root);
    }
    private int Max(Node root){
        if(root==null)
            return Integer.MIN_VALUE;
        int left=Max(root.left);
        int right=Max(root.right);
        return Math.max(left,Math.max(right,root.val));
    }

    public int height(){
        return height(root);
    }

    private int height(Node root){
        if(root==null){
            return -1;
        }
        int left=height(root.left);
        int right=height(root.right);
        return Math.max(left,right)+1;
    }
}

class call{
    public static void main(String[] args) {
        Tree_Implementation tree=new Tree_Implementation();
        tree.Binary_Tree();
        tree.display();
        System.out.println();
        tree.PreOrder();
        System.out.println();
        tree.PostOrder();
        System.out.println();
        tree.InOrder();
        System.out.println();
        System.out.println(tree.Search(1000));
    }
}

//Input
//10 true 30 true -7 false false true 50 true 11 false true 12 true 13 false false false true 180 false false true 140 true 170 false false true 80 true 120 false false  true 130 true 110 false true 12 false false false