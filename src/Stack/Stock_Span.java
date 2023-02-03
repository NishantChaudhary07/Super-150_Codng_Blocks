package Stack;

import java.util.Stack;

public class Stock_Span {
    public static void span(int[] arr){
        Stack<Integer>  st=new Stack<>();
        int[] ans=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[i]>=arr[st.peek()]){
                st.pop();
            }
            if(!st.isEmpty()) {
                ans[i] = i - st.peek();
            }
            else {
                ans[i]=i+1;
            }
            st.push(i);
        }
        for(int ele:ans){
            System.out.print(ele+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr={10,2,1,3,4,8};
    span(arr);
    }
    }

