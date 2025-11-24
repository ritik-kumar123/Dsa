public class Linklist
{
    static int length =0;
    static Node head;
    static Node tail;
    public static void display(Node head)
    {
        if(head==null)
        {
            return;
        }
        length++;
        System.out.print(head.data+" ");
        display(head.next);
    }
    public static void insertEnd(Node head,int val)
    {
        Node temp = new Node(val);
        Node t=head;
          while (t.next!=null)
            {
                t=t.next;
            }
            t.next=temp;
    }

  public static class Node
     {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
        public static void main(String[] args) {
            Node a = new Node(15);
            Node b = new Node(20);
            Node c = new Node(25);
            Node d = new Node(35);
            a.next = b;
            b.next = c;
            c.next = d;


//            System.out.println(a.data);
//            System.out.println(a.next.data);
//            System.out.println(a.next.next.data);

            insertEnd(a,87);
            display(a);

        }
    }


