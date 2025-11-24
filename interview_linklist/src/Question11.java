// given a linked list, split iit into two lists such that one contains odd values,while the other contains even values.


public class Question11
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

    static void splitoddeven( Node head)
    {
        Node temp = head;
        Node temp1 = new Node(2);
        Node temp2 = new Node(1);
        Node head1 = temp1;
        Node head2 = temp2;
        while (temp!= null)
        {
            if (temp.data%2==0)
            {

                    temp1.next = temp;
                    temp1 = temp;
                    temp = temp.next;
                    temp1.next=null;
            }
            else
            {
                    temp2.next = temp;
                    temp2 = temp;
                    temp = temp.next;
                    temp2.next=null;
            }
        }
        System.out.println("even");
        display(head1.next);
        System.out.println("odd");
        display(head2.next);
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

            Node head = new Node(3);
            Node a = new Node(5);
            Node b = new Node(4);
            Node c = new Node(1);
            Node d= new Node(2);
            Node e = new Node(8);
            Node f = new Node(10);
            Node g = new Node(13);
            head.next = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            f.next=g;
            splitoddeven(head);
        }
}
