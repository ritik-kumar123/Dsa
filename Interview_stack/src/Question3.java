import java.util.Stack;

// Push at bottom recursivelly
public class Question3
{
    public static  void pushRec(Stack<Integer> s)
    {
        if(s.isEmpty())
        {
            s.push(5);
            System.out.print(s.peek()+" ");
            return;
        }
        int top=s.pop();
        pushRec(s);
        s.push(top);
        System.out.print(s.peek()+" ");
    }

    public static void main(String[] args)
    {
        Stack<Integer> s = new Stack<>();
        s.push(10);
        s.push(15);
        s.push(20);
        s.push(25);
        s.push(30);
        pushRec(s);
    }
}
