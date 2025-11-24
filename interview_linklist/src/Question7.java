// cycle in a linked list
public class Question7
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data= data;
        }
    }
    static Boolean checkCycle(Node head)
    {
        Node fast=head;
        Node slow=head;
        while (fast!=null && slow!=null && fast.next!=null)
        {
          slow=slow.next;
          fast=fast.next.next;
          if(fast==slow)
              return true ;
        }
        return false;
    }


    public static void main(String[] args)
    {
            Node head=new Node(3);
            Node a= new Node(2);
            Node b= new Node(0);
            Node c=new  Node(-4);
            head.next=a;
            a.next=b;
            b.next=c;
            c.next=a;
        System.out.println(checkCycle(head));

    }
}
