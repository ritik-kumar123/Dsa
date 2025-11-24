
// find the maximum twin sum of a linked list of even length;
public class Question16
{
    static class Node
    {
        int data;
        Node next;

        Node(int data)
        {
            this.data = data;
        }

    }

    static Node reverse( Node head)
    {
        Node curr = head;
        Node prev=null;
        Node agla=null;
        while (curr!=null) {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
             curr = agla;
        }
        return prev;
    }
    static int evenSumTwin(Node head)
    {
        Node slow=head;
        Node fast=head;
        while ( fast.next!=null && fast.next.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = reverse(slow.next);
        int large=Integer.MIN_VALUE;
        slow.next=temp;
        Node temp1 = head;
        Node temp2 = slow.next;
        while (temp2!=null)
        {
            if(large<temp1.data+temp2.data)
              large=temp1.data+temp2.data;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return large;
    }


    public static void main(String[] args)
    {
        Node head = new Node(1);
            Node a = new Node(10);
            Node b = new Node(13);
            Node c = new Node(4);
            Node d= new Node(5);
            Node e = new Node(6);
            Node f = new Node(7);
            Node g = new Node(2);
            head.next = a;
              a.next = b;
              b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next=g;
        System.out.println(evenSumTwin(head));
    }
}
