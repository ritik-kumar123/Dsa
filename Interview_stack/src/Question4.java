// Reverse stack recursivelly

import java.util.Stack;

public class Question4
{
    public static void reverseStack(Stack<Integer> s)
    {
        if(s.isEmpty())
            return;
        int top=s.pop();
        reverseStack(s);
        insertBottom(s,top);


    }
    public static void insertBottom(Stack<Integer> s,int ele)
    {
        if(s.isEmpty())
        {
            s.push(ele);
            return;
        }
        int top=s.pop();
        insertBottom(s,ele);
        s.push(top);

    }


    public static void main(String[] args)
    {
        Stack<Integer> st= new Stack<>();
        st.push(25);
        st.push(12);
        st.push(13);
        st.push(32);
        st.push(21);
        st.push(54);
        System.out.println(st);
        reverseStack(st);
        System.out.println(st);
    }
}
