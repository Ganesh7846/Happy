import java.util.*;
class Node {
    int data;
    Node left;
    Node right;
    
    Node(int newData) {
        this.data = newData;
        left=right=null;
    }
}
public class Main {
    static void mirror(Node root) {
        if(root == null) {
            return;
        }
        mirror(root.left);
        mirror(root.right);
        
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
    }
    
    static void levelorder(Node root) {
        if(root == null) {
            System.out.print("N"+" ");
            return;
        }
        
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()) {
            Node curr = q.poll();
            
            if(curr == null) {
                System.out.print("N"+" ");
                continue;
            }
            
            System.out.print(curr.data+" ");
            
            q.add(curr.left);
            q.add(curr.right);
        }
    }
    
    public static void main(String [] args) {
        Node root = new Node(2);
        root.left = new Node(4);
        root.right = new Node(5);
        root.right.right = new Node(7);
        root.right.right.left = new Node(9);
        
        mirror(root);
        levelorder(root);
        
    }
}