//import java.util.*;
//public class Aggcows {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        for (int k = 1; k <= t; k++) {
//            int nos = sc.nextInt();
//            int noc = sc.nextInt();
//            int[] stalls = new int[nos];
//            for (int i = 0; i < nos; i++) {
//                stalls[i] = sc.nextInt();
//            }
//            Arrays.sort(stalls);
//            System.out.print(largestMinDist(stalls,(stalls[nos-1]-stalls[0])/2,noc));
//        }
//    }
//
//    public static int largestMinDist(int[] stalls, int mid, int noc) {
//        int start = 0;
//        int ans=0;
//        int end = stalls[stalls.length - 1] - stalls[0];
//        while (start <= end) {
//            if (isItPossible(stalls, mid, noc)) {
//                ans = mid;
//                start = mid + 1;
//            }
//            else {
//                end = mid - 1;
//            }
//            mid = (start + end) / 2;
//        }
//        return ans;
//    }
//    public static boolean isItPossible(int[] stalls,int mid, int noc){
//        int cow=1;
//        int pos=stalls[0];
//        int i=1;
//        while(i<stalls.length){
//            if(stalls[i]-pos >=mid){
//                cow++;
//                pos=stalls[i];
//            }
//            if(cow>=noc)
//                return true;
//            i++;
//        }
//        return false;
//    }
//}

import java.util.*;
import java.lang.*;

public class Aggcows
{
    public static boolean isPossible(int[] stalls,int mid,int noc){
    int currpos=stalls[0];
    int i=1;
    int cows=1;
    while(i<stalls.length){
        if(stalls[i]-currpos>=mid){
            cows++;
            currpos=stalls[i];
        }
        if(cows>=noc)
            return true;
        i++;
    }
    return false;
}

    public static int largestMinDist(int[] stalls,int mid,int noc){
        int start=0;
        int end=stalls[stalls.length-1];
        int ans=0;
        while(start<=end){
            if(isPossible(stalls,mid,noc)){
                ans=mid;
                start=mid+1;
            }
            else{
                end=mid-1;
            }
            mid=(start+end)/2;
        }
        return ans;
    }
    public static void main (String[] args) throws java.lang.Exception
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int k=1;k<=t;k++){
            int nos=sc.nextInt();
            int noc=sc.nextInt();
            int[] stalls=new int[nos];
            for(int i=0;i<nos;i++){
                stalls[i]=sc.nextInt();
            }
            Arrays.sort(stalls);
            System.out.println(largestMinDist(stalls,(stalls[0]+stalls[stalls.length-1])/2,noc));
        }
    }
}