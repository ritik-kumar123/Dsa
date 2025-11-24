public class linked
{
    public static class Node
    {
        int data;
        Node next;
        Node(int data)
        {
            this.data = data;
        }
    }
    public static class linkedlist {
        int size = 0;
        Node head = null;
        Node tail = null;

        void insertAtEnd(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
            } else {
                tail.next = temp;
            }
            tail = temp;
            size++;
        }

        void display() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
            System.out.println();

        }

        void insertAtBeginning(int val) {
            Node temp = new Node(val);
            if (head == null) {
                head = temp;
                tail = temp;
            } else {
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insert(int idx, int val) {
            Node t = new Node(val);
            Node temp = head;
            if (size == idx) {
                insertAtEnd(val);
            } else if (idx == 0) {
                insertAtBeginning(val);
            } else if (idx < 0 || idx > size) {
                System.out.println("invalid index ");
            } else {
                for (int i = 1; i < idx; i++) {
                    temp = temp.next;
                }
                t.next = temp.next;
                temp.next = t;
                size++;
            }
        }

        int getElement(int ind)
        {

                Node temp = head;
                for (int i = 0; i < ind; i++)
                {
                    temp = temp.next;
                }
               return temp.data;

        }
        void deleteAtIndex(int ind) {

            Node temp = head;
            if (ind == 0) {

                head = temp.next;
                size--;
            } else
            {
                for (int i = 1; i <= ind - 1; i++) {
                    temp = temp.next;
                }
                temp.next = temp.next.next;
                if(ind==size-1)
                  tail=temp;

            }
            size--;
        }


    }
    public static void main(String[] args)
    {
        linkedlist l = new linkedlist();
        l.insertAtEnd(20);
        l.insertAtEnd(25);
        l.insertAtEnd(30);
        l.insertAtEnd(34);
        l.insertAtBeginning(19);
        l.display();
        l.deleteAtIndex(4);
        System.out.println(l.tail.data);
        l.display();
    }
}
