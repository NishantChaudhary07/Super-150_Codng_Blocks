import java.util.*;
public class Target_Sum_Pair {
        public static void main(String args[]) {
            Scanner sc=new Scanner(System.in);
            int len=sc.nextInt();
            int[] arr=new int[len];
            for(int i=0;i<len;i++){
                arr[i]=sc.nextInt();
            }
            int target=sc.nextInt();
            int start=0;
            int end=len-1;
            Arrays.sort(arr);
            while(start<=end){
                if(arr[start]+arr[end]==target) {
                    System.out.println(arr[start] + " and " + arr[end]);
                    start++;
                    end--;
                }
                else if(arr[start]+arr[end]>target){
                    end--;
                }
                else if(arr[start]+arr[end]<target){
                    start++;
                }
            }
        }
    }

