public class SumOfNnumbersInGivenRange {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;

//        //By Brute Force Method
//        int sum = 0;
//        for (int f = a; f <= b ; f++) {
//            sum =sum +f ;
//        }
//        System.out.println(sum);

        //By Formula Method
//        int result = (b*(b+1)/2) - (a*(a+1)/2) + a ;
//        System.out.println(result);

        //By Recursion Method
        int sum = getSum(0,a,b);
        System.out.println(sum);

    }
        private static int getSum(int sum , int a ,int b) {
            if (a > b)
                return sum;

            return a + getSum(sum,a+1,b);
        }

}
