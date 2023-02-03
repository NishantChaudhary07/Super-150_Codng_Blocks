package OptimisedApproach;

import java.util.Scanner;

public class PrimeNumbers {
    public static  void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
    }

    public static void printPrime(int n){
        boolean[] arr=new boolean[n+1];
        //True for not prime
        arr[0]=true;
        arr[1]=true;
        for(int i=2;i*i<=n;i++){
            if(arr[i]==false){
                for(int j=2;i*j<=n;j++){
                    arr[i*j]=true;
                }
            }
        }
        for(int i=0;i<n+1;i++){
            if(arr[i]==false)
                System.out.println(i);
        }
    }
}
