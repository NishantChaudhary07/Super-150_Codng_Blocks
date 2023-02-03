package Recursion.Backtrack;

public class CoinsSumCombinations {
    public static int combinations(int[] coins,int targetsum,int idx,String ans){
        if(targetsum==0){
            System.out.println(ans);
            return 1;
        }
        int count=0;
        for(int i=idx;i<coins.length;i++){
            if(targetsum>=coins[i]){
                count+=combinations(coins,targetsum-coins[i],i,ans+" "+coins[i]);
            }
        }
        return count;
    }

    public static void main(String[] args){
        int[] coins={2,3,5,7};
        System.out.println(combinations(coins,10,0,""));
    }
}
