package Recursion;

public class CoinToss {
    public static void main(String[] args) {
        int n=3;
        System.out.println(combinations(n,""));
    }
    public static int combinations(int n,String ans){
        if(n==0){
            System.out.println(ans);
            return 1;
        }

//        int c1=combinations(n-1,ans+"H");
//        int c2=combinations(n-1,ans+"T");
//        return c1+c2;
        return combinations(n-1,ans+"H")+combinations(n-1,ans+"T");

    }
}
