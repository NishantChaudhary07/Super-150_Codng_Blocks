package Recursion;

public class No_2_Head_Together {
    public static void main(String[] args) {
    head(3,"");
    }

    public static void head(int n,String ans)
    {
        if(n==0){
            System.out.println(ans);
            return;
        }
        if(ans.length()==0 || (ans.length()>0 && ans.charAt(ans.length()-1)!='H'))
            head(n-1,ans+"H");

            head(n-1,ans+"T");
    }
    }

