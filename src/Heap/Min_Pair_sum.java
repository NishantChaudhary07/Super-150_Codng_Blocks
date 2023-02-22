package Heap;

import java.util.PriorityQueue;

/*
arr={2,3,4,1,5}
1+2=3     take min 2 elements in every step &
arr={3,3,4,5}     replace them with their sum
3+3=6
arr={6,4,5}
4+5=9
arr={6,9}
6+9=15
ans=3+6+9+15=33
 */
public class Min_Pair_sum {
    public static void main(String[] args) {
        int[] arr={2,3,4,1,5};
        System.out.println(min_sum_pair(arr));
    }
    public static int min_sum_pair(int[] arr){
        int sum=0;
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        for(int ele:arr){
            pq.add(ele);
        }
        while(pq.size()!=1){
            int a=pq.poll();
            int b=pq.poll();
            sum+=a+b;
            pq.add(a+b);

        }
        return sum;
    }
}
