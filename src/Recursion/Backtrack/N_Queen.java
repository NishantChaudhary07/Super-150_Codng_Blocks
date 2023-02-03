package Recursion.Backtrack;

public class N_Queen {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        printPath(board,0,n);
    }
    public static void display(boolean[][] board){
        for(int i=0;i<board.length;i++){
            for(int j=0;j< board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static boolean isPossible(boolean[][] board,int row,int col) {
        int r = row;
        int c = col;
        while (r >= 0) {
            if (board[r][c] == true) {
                return false;
            }
            r--;
        }
        r=row;
        while(r>=0 && c>=0){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c--;
        }
        r=row;c=col;
        while(r>=0 && c< board.length){
            if(board[r][c]==true){
                return false;
            }
            r--;
            c++;
        }
        return true;
    }

    public static  void printPath(boolean[][] board,int row,int queens){
        if(queens==0){
            display(board);
            System.out.println();
            return;
        }
        if(row==board.length){
            return;
        }

        for(int col=0;col<board.length;col++){
            if(isPossible(board,row,col)){
                board[row][col]=true;
                printPath(board,row+1,queens-1);
                board[row][col]=false;
            }
        }
    }
}
