public class FindNthTermInFibonacciSeries {
    public static void main(String[] args) {
        int num = 5 ;
        int a = 0 ;
        int b =1 ;
        int nextNumber = 0;
        System.out.println( num + " term in Fibonacci Series:");
        for(int i =2 ;i <=num ; i++){
            nextNumber = a + b;
            a = b;
            b = nextNumber;
        }
        System.out.print(a);
    }
}
