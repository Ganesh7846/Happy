//program to calculate the grade using student marks
class Student {
    String Name;
    int roll_No;
    int marks;
    
    Student(String Name,int roll_No,int marks) {
        this.Name = Name;
        this.roll_No = roll_No;
        this.marks = marks;
    } 
    
    //method to calculate the grade
    public void StudentGrade(){
        if(marks >= 90) {
            System.out.println("Grade : "+"A+");
        }else if(marks >= 85) {
            System.out.println("Grade : "+"A");
        }else if(marks >= 80) {
            System.out.println("Grade : "+"B+");
        }else if(marks >= 70) {
            System.out.println("Grade : "+"B");
        }else if(marks >= 65){
            System.out.println("Grade : "+"C+");
        }else {
            System.out.println("Grade : "+"C");
        }
    }
    
    //Method to display Student Details
    public void Display(){
        System.out.println("--------Student Details--------");
        System.out.println("Name : "+Name);
        System.out.println("Roll.No : "+roll_No);
        System.out.println("Marks : "+marks);
        StudentGrade();
        System.out.println("-------------------------------");
    }
}
public class sum {
    public static void main (String [] args) {
        Student d = new Student("ganesh", 33, 90);
        Student b = new Student("Bablu",89,99);
        Student c = new Student("praveen",6,55);
        Student e = new Student("vishwa",56,89);
        Student f = new Student("Praveen",4,34);
        Student g = new Student("vijju",68,29);

        d.Display();
        b.Display();
        c.Display();
        e.Display();
        f.Display();
        g.Display();
        
    } 
}
