package Tree.BST;

import Tree.Tree_Implementation;

public class BST_Implementation {
    private class Node{
        int val;
        Node left;
        Node right;
    }

    private Node root;
    BST_Implementation(int[] in){
        this.root=CreateTree(in,0,in.length-1);
    }

    private Node CreateTree(int[] in,int start,int end){
        if(start>end){
            return null;
        }
        int mid=(start+end)/2;
        Node nn=new Node();
        nn.val=in[mid];
        nn.left=CreateTree(in,start,mid-1);
        nn.right=CreateTree(in,mid+1, end);
        return nn;
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
        int[] in={10,20,30,40,50,60};
        BST_Implementation bst=new BST_Implementation(in);
        bst.PreOrder();
    }
}
