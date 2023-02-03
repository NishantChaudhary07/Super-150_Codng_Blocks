public class Pattern5{
    public static void main(String[] args){
        int row=5;
        int i=1;
        int star=1;
        int space=4;
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
                if(k%2!=0)
                    System.out.print("* ");
                else
                    System.out.print("  ");
                k++;
            }
            System.out.println("");
            i++;
            star+=2;
            space--;
        }
  //Method2
//        int row=5;
//        int i=1;
//        int star=1;
//        int space=4;
//        while(i<=row)
//        {
//            int j=1;
//            while(j<=space){
//                System.out.print("  ");
//                j++;
//            }
//            int k=1;
//            while(k<=star)
//            {
//                System.out.print(" *  ");
//                k++;
//            }
//            System.out.println("");
//            i++;
//            star++;
//            space--;
//        }
    }
}



