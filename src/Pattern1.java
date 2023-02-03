public class Pattern1 {
    public static void main(String[] args){
        int row=5;
        int i=1;
        while(i<=row)
        {
            int j=1;
            while(j<=i)
            {
                System.out.print("* ");
                j++;
            }
            System.out.println("");
            i++;
        }
    }
}
