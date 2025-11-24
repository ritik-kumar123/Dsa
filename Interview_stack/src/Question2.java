// Insert at bottom / any index

import java.util.Scanner;
import java.util.Stack;

public class Question2
{
    public static void  displayReverseRec(Stack<Integer> st)
    {
        if(st.isEmpty())
            return;
        int top = st.pop();
        System.out.print(top+" ");
        displayReverseRec(st);
        st.push(top);
    }
    public static void  displayRec(Stack<Integer> st)
    {
        if(st.isEmpty())
            return;
        int top = st.pop();
        displayRec(st);
        System.out.print(top+" ");
        st.push(top);
    }

    public static void main(String[] args)
    {
        Stack<Integer> st = new Stack<>();
        st.push(4);
        st.push(5);
        st.push(7);
        st.push(9);
        st.push(12);
        displayRec(st);
//         System.out.println(st);
//        Stack<Integer> rt = new Stack<>();
//        System.out.println("Enter any Index ");
//        Scanner sc = new Scanner(System.in);
//        int idx= sc.nextInt();
//        System.out.println("Enter Any Element ");
//        int ele = sc.nextInt();
//        while (st.size()>idx)
//        {
//            rt.push(st.pop());
//        }
//        st.push(ele);
//        while (rt.size()>0)
//        {
//            st.push(rt.pop());
//        }
//        System.out.println(st);
    }
}
