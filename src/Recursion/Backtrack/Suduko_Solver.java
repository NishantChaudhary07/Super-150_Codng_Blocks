package Recursion.Backtrack;

public class Suduko_Solver {
    public static void main(String[] args) {
     int[][] grid={ {3, 0, 6, 5, 0, 8, 4, 0, 0},
             {5, 2, 0, 0, 0, 0, 0, 0, 0},
             {0, 8, 7, 0, 0, 0, 0, 3, 1},
             {0, 0, 3, 0, 1, 0, 0, 8, 0},
             {9, 0, 0, 8, 6, 3, 0, 0, 5},
             {0, 5, 0, 0, 9, 0, 6, 0, 0},
             {1, 3, 0, 0, 0, 0, 2, 5, 0},
             {0, 0, 0, 0, 0, 0, 0, 7, 4},
             {0, 0, 5, 2, 0, 6, 3, 0, 0} };

     Solver(grid,0,0);
    }

    public static  void Solver(int[][] grid,int row,int col){
        if(col==grid.length){
            row++;
            col=0;
        }
        if(row==grid.length)
        {
            display(grid);
            return;
        }
        if(grid[row][col]!=0){
            Solver(grid,row,col+1);
        }

        else{
            for(int val=1;val<=9;val++){
                if(isPossible(grid,row,col,val)){
                    grid[row][col]=val;
                    Solver(grid,row,col+1);
                    grid[row][col]=0;
                }
            }
        }
    }

    public static boolean isPossible(int[][] grid,int row,int col,int val){
        int c=0;
        while(c< grid.length){
            if(grid[row][c]==val){
                return false;
            }
            c++;
        }

        int r=0;
        while(r< grid.length){
            if(grid[r][col]==val){
                return false;
            }
            r++;
        }

        r=row-row%3;
        c=col-col%3;
        for(int i=r;i<r+3;i++){
            for(int j=c;j<c+3;j++){
                if(grid[i][j]==val){
                    return false;
                }
            }
        }
        return true;
    }

    public static  void display(int[][] grid){
        for(int i=0;i< grid.length;i++){
            for(int j=0;j< grid.length;j++){
                System.out.print(grid[i][j]+" ");
            }
            System.out.println();
        }
    }
}
