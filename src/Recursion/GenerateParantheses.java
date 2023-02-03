package Recursion;

public class GenerateParantheses {
    public static void generateParanthesis(int n,int op,int cl,String out) {
        if(op==n && cl==n){
            System.out.println(out);
            return;
        }
        if(op<n)
            generateParanthesis(n,op + 1, cl,out + '(');
        if(cl<op)
            generateParanthesis(n,op, cl+1,out + ')');
//
    }

    public static void main(String[] args) {
        generateParanthesis(3,0,0,"");
    }
}
