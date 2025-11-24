// implementation of stack using array
public class arrayImplementation
{
   public static class Stack
    {
     private int[] arr=new int[5];
   private   int idx= 0;
     void push(int x)
        {
            if(isFull())
            {
                System.out.println("stack is full");
                return;
            }
            arr[idx]=x;
            idx++;
        }
        int peek()
        {
            if(idx==0)
            {
                System.out.println("Stack is Empty");
                return  -1;
            }
          return arr[idx--]  ;
        }
         int capacity()
         {
             return arr.length;
         }

        int pop()
        {
            if(idx==0)
            {
                System.out.println("Stack is Empty");
                return  -1;
            }
                int top = arr[--idx];
                arr[idx]=0;
                return top;
        }
        void display()
        {
            for(int i=0; i<idx;i++)
            {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size()
        {
            return idx;
        }
        boolean isEmpty()
        {
            if(idx==0)
                return true;
            return false;
        }
        boolean isFull()
        {
            if(idx==arr.length)
                return true;
            return false;
        }




    }

    public static void main(String[] args)
    {
      Stack st= new Stack();
      st.push(4);
      st.push(5);
      st.push(6);
      st.push(3);
      st.push(1);
      st.display();
      System.out.println(st.size());
      st.pop();
      st.display();
        System.out.println(st.isFull());
        st.push(100);
        System.out.println(st.isFull());
        st.push(111);
        System.out.println(st.isEmpty());

    }
}
