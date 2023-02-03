public class Pattern2 {
    public static void main(String[] args){
        int i=1;
        int space=4;
        int star=1;
        while(i<=5){
            int j=1;
            while(j<=space){
                System.out.print("  ");
                j++;
            }

            int k=1;
            while(k<=star){
                System.out.print("* ");
                k++;
            }
            System.out.println(" ");
            i++;
            space--;
            star++;
        }
        }
    }

