import java.util.Scanner;

public class Pattern6{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=5;
        int row=1;
        int star=1;
        while(row<=2*n-1)
        {
            int j=1;
            if(row<n) {
                while (j <= star) {
                    System.out.print("* ");
                    j++;
                }
                star++;
            }
            else{
                while (j <= star) {
                    System.out.print("* ");
                    j++;
                }
                star--;
            }
            System.out.println("");
            row++;
        }
    }
}
