public class IsPrimeOrNot {
    public static void main(String[] args) {
        int i, n = 2;
        boolean isPrime = true;

        if (n < 2)
            isPrime = false;
        else {
            for (i = 2; i < n; i++) {
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        String result = isPrime ? "Prime " :"Not Prime";
        System.out.println("the number "+ n + " is " + result);
    }
}
