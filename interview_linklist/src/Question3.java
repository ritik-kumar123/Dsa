
// removing nth node from the end of linked list

public class Question3
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
    static Node nthRemove(Node head,int n)
    {
//        int size=0;
//        Node temp=head;
//        while (temp!=null)
//        {
//            size++;
//        }
//        int m=size+n-1;
//        temp=head;
//        for(int i=0;i<m-1;i++)
//        {
//            temp=temp.next;
//        }
//        Node r=temp.next;
//        temp.next=temp.next.next;
//        return r;

        Node fast= head;
        Node slow = head;

        for(int i=1;i<=n;i++)
        {
            fast=fast.next;
        }
        if(fast==null)
        {
            head=head.next;
            return head;
        }
        while (fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        return head;
    }

    static void display(Node head)
    {
        Node temp=head;
        while (temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
        System.out.println();

    }



    public static void main(String[] args)
    {
        Node a= new Node(100);
        Node b= new Node(13);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        display(a);
        a=   nthRemove(a,6);
        display(a);
    }
}
