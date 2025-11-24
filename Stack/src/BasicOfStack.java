import java.util.Stack;

public class BasicOfStack
{
    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(23);
        st.push(60);
        st.push(30);
        st.push(215);
        System.out.println(st.peek());
        System.out.println(st);
        st.pop();
        System.out.println(st);
        System.out.println("size is: "+st.size());
        while (st.size()>2)
        {
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println(st.peek());

    }
}
