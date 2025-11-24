// Deleting the Middle element of the Linked list


public class Question6
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
    static Node deleteEelement(Node head)
    {
        Node fast=head;
        Node slow=head;
        if(head.next==null)
        {
            return null;
        }
        else
        {
            while (fast.next.next != null && fast.next.next.next != null) {
                fast = fast.next.next;
                slow = slow.next;
            }
            Node delete = slow.next;
            slow.next = slow.next.next;
            return delete;
        }
       }
       static void display(Node head)
       {
           Node temp= head;
           while (temp!=null)
           {
               System.out.print(temp.data+" ");
               temp=temp.next;
           }
       }



    public static void main(String[] args)
    {
            Node head=new Node(87);
            Node a= new Node(100);
            Node b= new Node(13);
            Node c=new  Node(15);
            Node d= new Node(5);
            Node e= new Node(12);
            Node f= new Node(10);
            head.next=a;
            a.next=b;
            b.next=c;
            c.next=d;
            d.next=e;
            e.next=f;
            Node delete=deleteEelement(head);
            if(delete==null)
                System.out.println("List is empty");
            else
                 System.out.println(delete.data);
            display(delete);
    }
}
