package Stack;

import java.util.Stack;

public class InsertAtBeginningOfStack {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        insertBottom(st,5);
        System.out.println(st);

    }

    private static void insertBottom(Stack<Integer> st,int item1){
        if(st.isEmpty()){
            st.push(item1);
            return;
        }

        int item=st.pop();
        insertBottom(st,item1);
        st.push(item);
    }
}
