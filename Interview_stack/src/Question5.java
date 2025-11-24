import java.util.Stack;

// Remove from bottom/ any index
public class Question5
{
    public static void removeBottom(Stack<Integer> s)
    {
        if(s.size()==1)
        {
            System.out.println( s.pop());
            return;
        }
       int x= s.pop();
        removeBottom(s);
        s.push(x);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(13);
        st.push(23);
        st.push(20);
        st.push(19);
        st.push(17);
        removeBottom(st);
        System.out.println(st);
    }
}
