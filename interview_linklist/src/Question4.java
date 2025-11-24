//finding intersation of two linked lists.

public class Question4
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

    static Node interaction(Node head1,Node head2)
    {   int m=0,n=0;
        Node temp1=head1;
        Node temp2= head2;
        while (temp1!=null)
        {
            //length of one node
            m++;
            temp1=temp1.next;
        }
        while (temp2!=null)
        {
            // length of second node
            n++;
            temp2=temp2.next;
        }
        temp1=head1;
        temp2= head2;
        if (m>n)
        {  m=m-n;
            while (m != 0) {
                temp1 = temp1.next;
                m--;
            }
        }
        else
        {
            n=n-m;
            while (n != 0)
            {
                temp2 = temp2.next;
                n--;
            }
        }
        while (temp1!=temp2)
        {
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return temp1;
    }


    public static void main(String[] args)
    {   Node head1=new Node(87);
        Node a= new Node(100);
        Node head2= new Node(90);
        Node b= new Node(13);
        Node b1= new Node(9);
        Node c= new Node(4);
        Node d= new Node(5);
        Node e= new Node(12);
        Node f= new Node(10);
        head1.next=a;
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        e.next=f;
        head2.next=b1;
        b1.next=a;
        Node inter_point=interaction(head1,head2);
        System.out.println(inter_point.data);


    }
}
