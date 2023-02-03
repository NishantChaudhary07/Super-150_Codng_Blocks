package Recursion;

public class DiceTargetSum {
    public static int Printpath(int curr,int end,String ans){
        if(curr==end){
            System.out.println(ans);
            return 1;
        }
        if(curr>end)
            return 0;
//        Printpath(curr+1,end,ans+1);
//        Printpath(curr+2,end,ans+2);
//        Printpath(curr+3,end,ans+3);
        int count=0;
        for(int dice=1;dice<end;dice++){
            count+=Printpath(curr+dice,end,ans+" "+dice);
        }
        return count;
    }
    public static  void main(String[] args){
        int n=4;
        System.out.println(Printpath(0,n,""));
    }
}
