public class FibonacciSeries {
    public static void main(String[] args) {
        int num = 10 ;
        int a = 0 ;
        int b =1 ;
        System.out.println("Fibonacci Series:");
        System.out.print(a + "," + b + ",");
        int nextNumber;
        for(int i =2 ;i <=num ; i++){
            nextNumber = a + b;
            a = b;
            b = nextNumber;
            System.out.print(nextNumber + ",");
        }
    }
}
