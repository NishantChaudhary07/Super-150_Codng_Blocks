package Recursion.Backtrack;

import java.util.Scanner;
//Input
     /*
5 4
OXOO
OOOX
XOXO
XOOX
XXOO

      */

public class Rat_Chases_its_Cheese {
    static boolean flag=false;
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int rows=sc.nextInt();
        int cols=sc.nextInt();
        char[][] maze=new char[rows][cols];
        for(int i=0;i<rows;i++){
            String str=sc.next();
            for(int j=0;j<cols;j++){
                maze[i][j]=str.charAt(j);
            }
        }
        int[][] path=new int[rows][cols];
        mazePath(maze,path,0,0);
        if(flag==false){
            System.out.println("NO PATH FOUND");
        }
    }

    public static void mazePath(char[][] maze,int[][] path,int cr,int cc){
        if(cr==maze.length-1 && cc==maze[0].length-1){
            if(maze[cr][cc]=='O'){
                flag=true;
                path[cr][cc]=1;
                display(path);
                path[cr][cc]=0;
            }
            return;

        }

        if(cr<0 || cr>=maze.length || cc<0 || cc>=maze[0].length || maze[cr][cc]=='X'){
            return;
        }

        int[] rows={1,0,-1,0};
        int[] cols={0,1,0,-1};
        maze[cr][cc]='X';
        path[cr][cc]=1;

        for(int i=0;i<4;i++){
            mazePath(maze,path,cr+rows[i],cc+cols[i]);
        }

        maze[cr][cc]='O';
        path[cr][cc]=0;
    }

    public static void display(int[][] path){
        for(int i=0;i<path.length;i++){
            for(int j=0;j<path[0].length;j++){
                System.out.print(path[i][j]+" ");
            }
            System.out.println();
        }
    }
}
