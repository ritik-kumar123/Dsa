// remove duplicate from a sorted linked list

public class Question12
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

    static void duplicate( Node head)
    {
        Node temp = head;
        Node temp1=head;
        while (temp!=null)
        {
            while ( temp!=null&&temp.data==temp1.data)
            {
                temp=temp.next;
            }
            temp1.next=temp;
            temp1=temp;
        }
    display(head);
    }
        static void display (Node head)
        {

            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
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
            duplicate(head);
        }

}
