//check wheather a linkedlist is palindrome or not
public class Question15
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

    public static boolean isPalindrome(Node head)
    {
        Node slow=head;
        Node fast=head;
        while ( fast.next!=null && fast.next.next!=null )
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        Node temp = reverse(slow.next);
        slow.next=temp;
        Node temp1 = head;
        Node temp2 = slow.next;
        while (temp2!=null  )
        {
            if(temp1.data!=temp2.data) return false;
            temp1=temp1.next;
            temp2=temp2.next;
        }
        return true;


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
            Node a = new Node(2);
            Node b = new Node(3);
            Node c = new Node(4);
            Node d= new Node(3);
            Node e = new Node(2);
            Node f = new Node(1);
//            Node g = new Node(4);
//            Node h = new Node(5);
//            Node i = new Node(6);
//            Node j = new Node(6);
            head.next = a;
            a.next = b;
            b.next = c;
            c.next = d;
            d.next = e;
            e.next = f;
//            f.next=g;
//            g.next=h;
//            h.next=i;
//            i.next=j;
            System.out.println( isPalindrome(head));
        }

}
