
class Stack {
    int cap,top;
    int a[];
    
    Stack(int cap1) {
        this.cap = cap1;
        top = -1;
        a = new int[cap];
    }
    
    public boolean push(int x) {
        if(top == cap-1){
            System.out.print("stack overflow");
            return false;
        }
        top++;
        a[top] = x;
        return true;
    }
    
    public int pop() {
        if(top < 0) {
            System.out.print("stack underflow");
            return 0;
        }
        return a[top--];
    }
    
    public int peek() {
        if(top < 0) {
            System.out.print("stack is Empty");
            return 0;
        }
        return a[top];
    }
    
    public boolean isFull(){
       return top==cap-1;
    }
    
    public boolean isEmpty(){
        return top<0;
    }
    public void display() {
        while(top>=0) {
            System.out.println(a[top--]);
        }
    }
}
public class Main{
    public static void main(String [] args) {
        Stack s = new Stack(4);
        s.push(1);
        s.push(3);
        s.push(5);
        s.push(8);
        // System.out.println(s.peek());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        // System.out.println(s.pop());
        System.out.println(s.isEmpty());
        System.out.println(s.isFull());
    }

}
