public class PrimeNumberInGivenRange {
    public static void main(String[] args) {
        int lower = 1,upper = 100;

        System.out.println("The Prime Numbers from " + lower + " to " + upper + " are: ");
        for(int i = lower ; i <= upper ; i++)
            if(isPrime(i))
                System.out.print(" "+ i);
    }

    private static boolean isPrime(int i) {

        if(i < 2)
            return false;

        for (int j = 2; j < i; j++) {
            if(i % j == 0)
                return false;
        }
        return true;
    }
}
