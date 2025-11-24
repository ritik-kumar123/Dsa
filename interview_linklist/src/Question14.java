// reverse linked list using iteration

public class Question14
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

    static void reverse( Node head)
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
    display(prev);
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
            reverse(head);
        }


}
