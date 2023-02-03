package Recursion;

public class CountSubSequence {
    public static int countSubSequences(String ques,String ans){
        if(ques.length()==0) {
            System.out.println(ans);
            return 1;
        }

        char ch=ques.charAt(0);
        int ans1=countSubSequences(ques.substring(1),ans);
        int ans2=countSubSequences(ques.substring(1),ans+ch);
        return ans1+ans2;
    }

    public static void main(String[] args) {
        System.out.println(countSubSequences("abc",""));
    }
}
