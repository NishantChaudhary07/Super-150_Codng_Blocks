public class Pattern3{
    public static void main(String[] args){
        int row=5;
        int i=1;
        int star=5;
        int space=0;
        while(i<=row)
        {
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }
            int k=1;
            while(k<=star)
            {
                System.out.print("* ");
                k++;
            }
            System.out.println("");
            i++;
            star--;
            space+=2;
        }
    }
}

