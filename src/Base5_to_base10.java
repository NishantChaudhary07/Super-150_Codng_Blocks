public class Base5_to_base10 {
    public static void main(String args[]){
        int num=342;
        int newnum=0;
        int multi=1;
        while(num>0){
            int rem=num%10;
            newnum=newnum+rem*multi;
            num=num/10;
            multi*=5;
        }
        System.out.println(newnum);
    }
}
