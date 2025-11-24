public class Question18
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
    static Node reversea(Node head)
    {
        Node temp=head;
        Node temp1=reverse(temp.next);
        temp.next=temp1;

        return temp;

    }
    static Node reverse(Node head)
    {  Node curr = head;
        Node prev=null;
        Node agla=null;
        while (curr.next!=null)
        {
            agla = curr.next;
            curr.next = prev;
            prev = curr;
            curr = agla;
        }
        Node temp=prev;
        Node temp1=temp;
        while (temp!=null)
        {
            if (temp.next!=null)
            {
                temp.next=curr;
                break;
            }
            temp=temp.next;
        }
        return temp1;
    }


    public static void main(String[] args)
    {
            Node head = new Node(1);
            Node a = new Node(2);
            Node b = new Node(3);
            Node c = new Node(4);
            Node d = new Node(5);
            Node e = new Node(6);
            Node f = new Node(7);
            head.next = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
            Node cu =reversea(head);
            display(cu);
    }
}
