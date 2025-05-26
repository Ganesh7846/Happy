public class Main {
    // Java program to pass a variable 
// number of arguments to a method
    
    public static void display(String... n){
        // Iterate through the array 
        // and print each name
        for(String i:n){
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void main(String []args){
        // Calling the 'Names' method with 
        // different number of arguments
        display("ganu","chetu","visu","vijju");
        display("ponu","monu","sonu");
    }
}