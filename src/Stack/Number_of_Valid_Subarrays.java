package Stack;
import java.util.*;
//https://leetcode.ca/all/1063.html
public class Number_of_Valid_Subarrays {
    private static int validSubaarays(int[] arr){
        int count=0;
        Stack<Integer> st=new Stack<>();
        int[] nextSmaller=new int[arr.length];
        for(int i=0;i< arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                nextSmaller[st.pop()]=i;
            }
            st.push(i);
//          Or count+=st.size();
        }
        while(!st.isEmpty()){
            nextSmaller[st.pop()]=arr.length;
        }

        for(int i=0;i<arr.length;i++){
//            System.out.println(nextSmaller[i]);
                count+=nextSmaller[i]-i;

        }
        return count;
    }
    public static void main(String[] args) {
    int[] arr={3,2,11,4,5,7};
        System.out.println(validSubaarays(arr));
    }
}
