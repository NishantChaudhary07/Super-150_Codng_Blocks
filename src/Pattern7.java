public class Pattern7{
    public static void main(String[] args){
        int n=5;
        int row=1;
        int star=5;
        int space=0;
        while(row<=2*n-1)
        {
            if(row<n) {
                int j = 1;
                while (j <= space) {
                    System.out.print("  ");
                    j++;
                }
                int k = 1;
                while (k <= star) {
                    System.out.print("* ");
                    k++;
                }
                star--;
                space+=2;
            }
            else{
                int j = 1;
                while (j <= space) {
                    System.out.print("  ");
                    j++;
                }
                int k = 1;
                while (k <= star) {
                    System.out.print("* ");
                    k++;
                }
                star++;
                space-=2;
            }
            System.out.println("");
            row++;

        }
    }
}

