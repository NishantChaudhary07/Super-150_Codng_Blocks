package Recursion.Backtrack;

public class QueenCombination {
    public static void main(String[] args) {
        boolean[] box=new boolean[4];
        combinations(box,2,0,"",0);
    }
    public static void combinations(boolean[] box,int tq, int qpsf, String ans, int idx) {
        if (qpsf == tq) {
            System.out.println(ans);
        }
        for (int i = idx; i < box.length; i++) {
            if (box[i] == false) {
                box[i] = true;
                combinations(box, tq, qpsf + 1, ans + 'b' + i + 'q' + qpsf, i+1 );
                box[i] = false;
            }
        }
    }
}


