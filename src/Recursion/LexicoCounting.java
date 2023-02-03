package Recursion;

public class LexicoCounting {
    public static void main(String[] args) {
        lexicoCounting(0,1000);
//        lexiographical(100,"");
    }
    public static void lexicoCounting(int curr, int n){
        if(curr>n){
            return;
        }
        System.out.println(curr);

        int i=0;
        if(curr==0){
            i=1;
        }
        for(;i<=9;i++){
            lexicoCounting(curr*10+i,n);
        }
    }
// Second method using String
public static void lexiographical(int n,String out){
    if(!out.isEmpty() && Integer.parseInt(out)>n){
        return;
    }
    System.out.println(out);
    int i=0;
    if(out.length()==0)
        i=1;
    for(;i<=9;i++){
        lexiographical(n,out+i);
    }
}
}
