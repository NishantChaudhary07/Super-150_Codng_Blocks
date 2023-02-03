import java.util.Scanner;

public class CompareStrings {
    public static int compare(String st1,String st2){
        int len1=st1.length();
        int len2=st2.length();
        int minlen=len1;
        if(len2<minlen){
            minlen=len2;
        }
        for(int i=0;i<minlen;i++){
            if((int)st1.charAt(i)>(int)st2.charAt(i)){
                return 1;
            }
        }
        return -1;
    }
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two strings");
        String st1=sc.next();
        String st2=sc.next();
        int res=compare(st1,st2);
        if(res==1)
            System.out.println(st2+" comes before "+st1);
        else
            System.out.println(st1+" comes before "+st2);
    }
}
