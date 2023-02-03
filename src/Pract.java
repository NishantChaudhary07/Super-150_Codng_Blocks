//package Stack;
//
//import java.util.Stack;
///* 1. Sunny Building
//   2. Daily Temp  :-  https://leetcode.com/problems/daily-temperatures/
//   3. Stock span  Link:- https://hack.codingblocks.com/app/contests/2883/502/problem
// */
//public class Pract {
//   public static void sort(int[] arr,int start, int end){
//       if(start>end){
//           return;
//       }
//       int mid=(start+end)/2;
//       sort(arr,start,mid);
//       sort(arr,mid+1,end);
//       sort(arr,start,mid,end);
//   }
//
//   public static void merge(int[] arr,int start,int mid,int end){
//       int len1=mid-start+1;
//       int len2=end-mid;
//       int[] leftarr=new int[len1];
//       int[] rightarr=new int[len2];
//
//       for(int i=0;i<len1;i++){
//           leftarr[i]=arr[start+i];
//       }
//
//       for(int j=0;j<len2;j++){
//           rightarr[i]=arr[mid+1+i];
//       }
//
//       int i=0,j=0,k=start;
//       while(i<len1 && j<len2){
//
//       }
//   }
//}
