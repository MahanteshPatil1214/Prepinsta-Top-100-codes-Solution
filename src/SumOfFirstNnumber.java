public class SumOfFirstNnumber {
    public static void main(String[] args) {
        int n=2;
        //By using Loop
        int sum=0;
        for(int i=1;i<=n;i++){
            sum += i;
        }
        System.out.println(sum);

        //By Using Formula of Sum N numbers
        int s = (n * (n+1)/2);
        System.out.println(s);

        //By Using Recursion
        int sumOf=getSum(n);
        System.out.println(sumOf);
    }

    private static int getSum(int n) {
        if (n==0)
            return 0;

        return n + getSum(n-1);
    }
}
