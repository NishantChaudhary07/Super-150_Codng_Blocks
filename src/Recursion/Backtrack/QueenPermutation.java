package Recursion.Backtrack;

public class QueenPermutation {
    public static void main(String[] args) {
        boolean[] box=new boolean[4];
        permutations(box,2,0,"");
    }
    public static void permutations(boolean[] box,int tq,int qpsf,String ans){
        if(tq==qpsf){
            System.out.println(ans);
            return;
        }
        for(int i=0;i<box.length;i++){
            if(box[i]==false){
                box[i]=true;
                permutations(box,tq,qpsf+1,ans+'b'+i+'q'+qpsf);
                box[i]=false;
            }
        }
    }
}
