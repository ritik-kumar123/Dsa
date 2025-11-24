// odd even index problem first come all odd index then even index

public class Question17
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
    static void display (Node head)
        {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();
        }


    static Node oddeven(Node head)
    {

        Node temp= head;
        Node even=new Node(0);
        Node odd= new Node(0);
        Node tempo= odd;
        Node tempe= even;
        while(temp!=null)
        {
           tempo.next=temp;
           temp=temp.next;
           tempo=tempo.next;

           tempe.next=temp;
           if(temp==null) break;
           temp=temp.next;
           tempe=tempe.next;
        }
        odd=odd.next;
        even=even.next;
        tempo.next=even;
        return odd;
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
            f.next = g;
            display(oddeven(head));

    }
}
