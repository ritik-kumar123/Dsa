//Find out the nodes where the cycle begins, i.e the node at which the tail nodes points.

public class Question8
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
    static Node checkBeginsCycle(Node head)
    {
        Node fast = head;
        Node slow = head;
        while(fast!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
            if (fast==slow)
                break;
        }
        Node temp=head;
        while (temp!=slow)
        {
            slow=slow.next;
            temp=temp.next;
        }
        return slow;
    }
    public static void main(String[] args)
    {
            Node head=new Node(3);
            Node a= new Node(2);
            Node b= new Node(0);
            Node c=new  Node(-4);
            head.next=a;
            a.next=b;
            b.next=c;
            c.next=c;
            Node check=checkBeginsCycle(head);
        System.out.println(check.data);

    }
}
