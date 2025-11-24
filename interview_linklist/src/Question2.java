// finding Nth node from the end of linked list
 //  m-n-1
public class Question2
{
   static class Node
   {
       int data;
       Node next;
       Node(int data)
       {
           this.data=data;
       }
   }
    static Node nthNode(Node head,int n)
    {
      Node fast=head;
      Node slow = head;
      for(int i=1;i<=n;i++)
      {
          fast=fast.next;
      }
      while (fast!=null)
      {
          fast=fast.next;
          slow=slow.next;
      }
      return slow;
    }

    public static void main(String[] args)
    {
        Node a= new Node(12);
        Node b= new Node(23);
        Node c= new Node(10);
        Node d= new Node(22);
        Node e= new Node(15);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;

        Node f=nthNode(a,4);
        System.out.println(f.data);

    }
}
