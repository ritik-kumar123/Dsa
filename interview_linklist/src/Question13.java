// reverse linkedlist using recursion

public class Question13
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
    static Node reverse(Node head)
    {

        if(head.next==null)
            return head;
        Node newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }

    static void display (Node head)
            {
                if(head==null)  return; // base case
                System.out.print(head.data + " ");  // work
                display(head.next);//call
        }
    public static void main (String[]args)
        {

            Node head = new Node(1);
            Node a = new Node(1);
            Node b = new Node(2);
            Node c = new Node(3);
            Node d= new Node(3);
            Node e = new Node(3);
            Node f = new Node(4);
            Node g = new Node(4);
            Node h = new Node(5);
            Node i = new Node(6);
            Node j = new Node(6);
            head.next = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next=g;
            g.next=h;
            h.next=i;
            i.next=j;
            Node re=reverse(head);
            display(re);

        }
}
