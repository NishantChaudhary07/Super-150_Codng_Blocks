package Recursion.Backtrack;
import java.util.*;
public class PalindromeString {
    public static  boolean isPalindrome(String str){
        int start=0;
        int end=str.length()-1;
        while(start<=end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static  void partition(String inp,List<String> list,List<List<String>> res){
        if(inp.length()==0)
        {
            res.add(new ArrayList(list));
            return;
        }
        for(int cut=1;cut<=inp.length();cut++){
            String s=inp.substring(0,cut);
            if(isPalindrome(s)) {
                list.add(s);
                partition(inp.substring(cut), list, res );
                list.remove(list.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        List<List<String>> res=new ArrayList<>();
        partition("nitin",list,res);
        System.out.println(res);
    }
}
