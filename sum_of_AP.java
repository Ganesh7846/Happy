class SeriesCalculator {
    public int calculateSum(int n) {
        int a = 1;
        int d = 2;
        int sum = (n/2)*((2*a)+(n-1)*d);
        return sum;
                                                                 //Sum = (n/2) * [2*a + (n-1)*d]                   
    }
}

public class oops {
    public static void main(String[] args) {
        int n=20;
        SeriesCalculator s = new SeriesCalculator();
        System.out.println("Sum:"+s.calculateSum(n));
    }
}