package Recursion.Backtrack;
//No backtrack in this question
public class CoinSumPermutations {
    public static void main(String[] args) {
        int[] coin={2,3,5,7};
        permutations(coin,10,"");
    }
    public static void permutations(int[] coin,int amount,String ans){
        if(amount==0){
            System.out.println(ans);
            return;
        }

        for(int i=0;i<coin.length;i++){
            if(amount>=coin[i])
                permutations(coin,amount-coin[i],ans+" "+coin[i]);
        }
    }
}
