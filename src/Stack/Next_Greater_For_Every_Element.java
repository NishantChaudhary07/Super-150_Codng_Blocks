package Stack;

import java.util.Stack;
/* 1. Sunny Building
   2. Daily Temp
   3. Stock span
 */
public class Next_Greater_For_Every_Element {
    public static void nextGreater(int[] arr){
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<arr.length;i++){
            while(!stack.isEmpty() && arr[i]>arr[stack.peek()]){
                arr[stack.pop()]=arr[i];
            }
            stack.push(i);
        }
        while(!stack.isEmpty()){
            arr[stack.pop()]=-1;
        }
    }

    public static void main(String[] args) {
        int[] arr={10,2,1,3,5,4,8,7};
        nextGreater(arr);
        for(int ele:arr){
            System.out.print(ele+" ");
        }
    }
}
