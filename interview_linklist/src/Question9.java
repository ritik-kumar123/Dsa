// merge Two sorted linked lists using extra space
public class Question9
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
    static Node merge(Node head1,Node head2)
    {
        Node temp1 = head1;
        Node temp2 = head2;
        Node temp3 = null;
        Node head = null;
        if(head2 ==null && head1==null)
            return null;
        if (head1 == null)
            return temp2;
          if(head2==null)
              return temp1;
        while (temp1!=null && temp2!=null)
        {
            if(temp1.data<temp2.data)
            {
                Node t= new Node(temp1.data);
                if(temp3==null)
                {
                    temp3=t;
                    head=t;

                }
                else {
                    temp3.next = t;
                    temp3 = t;

                }
                temp1 = temp1.next;
            }
            else
            {
                Node t= new Node(temp2.data);
                if(temp3==null)
                {
                    temp3=t;
                    head=t;
                }
                else
                {
                    temp3.next = t;

                    temp3 = t;
                }
                temp2 = temp2.next;
            }
        }
        if (temp1!=null)
        {
            temp3.next=temp1;
        }
        if (temp2!=null)
        {
            temp3.next=temp2;

        }
        return head;
    }
    static void display(Node head) {

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public static void main(String[] args)
    {
        Node head1=new Node(1);
        Node a= new Node(3);
        Node b= new Node(5);
        Node c=new Node(8);
        Node head2=new Node(2);
        Node a1= new Node(4);
        Node b1= new Node(6);
        Node c1= new Node(7);
        head1.next=a;
        a.next=b;
        b.next=c;
        head2.next=a1;
        a1.next=b1;
        b1.next=c1;
       display(merge(head2,head1));
    }
}
