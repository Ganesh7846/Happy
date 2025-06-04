class Rectangle {
    private int length;
    private int width;

    Rectangle(int l , int w){
        this.length = l;
        this.width = w;
    }

    Rectangle(){
        this.length = 1;
        this.width = 1;
    }

    public int getLength(){
        return length;
    }

    public void setLength(int length) {
        if(length < 0){
            System.out.println("enter the positive number:");
        }else{
            this.length = length;
        }
    }

    public int getwidth() {
        return width;
    }

    public void setwidth(int width) {
        if(width < 0) {
            System.out.println("width should be positive");
        }else{
            this.width = width;
        }
    }

    public void calculate(){
        System.out.println(length*width);
    }

}
public class sum {
    public static void main(String []args){
    Rectangle r = new Rectangle();
    r.calculate();

    r.setLength(9);
    r.setwidth(5);
    r.calculate();
    Rectangle d = new Rectangle(8,5);
    d.calculate();
    }
}