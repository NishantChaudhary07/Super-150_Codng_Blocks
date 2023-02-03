package Tree;

public class Binary_Tree_From_Pre_Inorder {
    public class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
//
//    public static TreeNode buildTree(int[] postorder,int[] inorder){
//
//    }
//
//    private  TreeNode CreateTree(int[] inorder,int ilo,int ihi,int[] preorder){
//        TreeNode nn=new TreeNode(preorder[plo]);
//        int idx=search(inorder,ilo,ihi,preorder[plo]);
//        int net=idx-ilo;
//    }
}
