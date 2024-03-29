import java.util.*;

public class Prac2 {
    public static void main(String[] args) {
//        Stack<Integer> st=new Stack<>();
//        st.push(10);
//        st.push(20);
//        st.push(30);
//        st.push(40);
//        st.push(50);
//        System.out.println(st);
//        reverse(st);
//        System.out.println(st);
        System.out.println(Math.ceil((double)3/6));
    }

    private static void reverse(Stack<Integer> st){
        if(st.isEmpty())
            return;

        int x=st.pop();
        reverse(st);
        insertBottom(st,x);
    }

    private static  void insertBottom(Stack<Integer> st,int x){
        if(st.isEmpty()){
            st.push(x);
            return;
        }
        int y=st.pop();
        insertBottom(st,x);
        st.push(y);
    }
}
