class Node {
    int data;
    Node Next;

    Node(int new_data){
        data=new_data;
        Next=null;
    }
}
public class GFG{

    //Insert At Front

    public static Node InsertAtFirst(Node head,int new_data){
        Node NewNode=new Node(new_data);
        NewNode.Next=head;
        return NewNode;

    }

    //Insert At The End

    public static Node InsertAtEnd(Node head,int New_data){
        Node NewNode=new Node(New_data);
        if(head == null){
            return NewNode;
        }

        Node last = head;

        while(last.Next != null){
            last=last.Next;
        }
        
        last.Next = NewNode;
        return head;
        

    }

    //Insert At After the Key

    public static Node InsertAtAfter(Node head , int New_data , int key){
        Node curr=head;
        
        while(curr != null){
            if(curr.data==key){
                break;
            }
            curr=curr.Next;
        }

        if(curr == null){
            System.out.println("Node Not Found");
            return head;
        }

        Node NewNode = new Node(New_data);

        NewNode.Next = curr.Next;

        curr.Next = NewNode;

        return head;
    }

    //Insert At Before The Key

    public static Node InsertAtBefore(Node head , int NewData , int key){
        if(head == null) {
            return null;
        }

        if(head.data == key){
            Node NewNode = new Node(NewData);
            NewNode.Next = head;
            return NewNode;
        }

        head.Next = InsertAtBefore(head.Next, NewData, key);
        return head;
    }

    //Print The List

    public static void Print_List(Node head){
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data+" ");
            curr = curr.Next;
        }
        System.out.println();
    }

    //Search the element int linkedlist

    public static boolean FindElement(Node head,int key){
        Node curr = head;
        while(curr != null){
            if(curr.data == key){
                return true;
            }
            curr=curr.Next;
        }
        return false;
    }

    //Search The Element In The LinkedList recursively

    public static boolean recursively(Node head , int key){
        if (head == null) {
            return false;
        }
        if(head.data == key){
            return true;
        }
        return recursively(head.Next, key);
    }

    public static int ListLength(Node head) {
        Node curr = head;
        int count = 0;
        while(curr != null){
            count++;
            curr = curr.Next;
        }
        return count;
    }

    public static Node DeleteAtFirst(Node head){
        if(head == null){
            return null;
        }

        Node temp = head;

        head = head.Next;

        temp = null;

        return head;
    }

    public static Node DeleteAtEnd(Node head){
        if(head == null){
            return null;
        }
        if(head.Next == null){
            return null;
        }

        Node secondLastNode = head;

        while(secondLastNode.Next.Next != null){
            secondLastNode = secondLastNode.Next;

        }

        secondLastNode = null;
        return head;
    }

    public static Node DeleteAtspeciedpos(Node head ,int pos){
        int length = ListLength(head);
        if(length < pos) {
            return null;
        }

        if(head == null){
            return null;
        }

        if(head.Next == null){
            return null;
        }
        Node curr = head;
        while(curr.Next.Next != ){

        } 

    }
    

    public static void main(String[] args) {
        
        Node head = new Node(1);
        head.Next=new Node(2);
        head.Next.Next = new Node(4);
        head.Next.Next.Next = new Node(5);
        head.Next.Next.Next.Next = new Node(6);

        Print_List(head);
        
        head = DeleteAtEnd(head);

        Print_List(head);

        // System.out.println("OriginalList:");
        // Print_List(head);

        // System.out.println("New List:");
        // Node g=InsertAtBefore(head , 1 ,3);

        // Print_List(g);

        

        
    }
}