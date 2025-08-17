public class NumberIsPalindromeOrNot {
    public static void main(String[] args) {
        int num = 1001 , reverse = 0,rem;
        System.out.println("Number:" + num);
        if(getReverse(num,reverse) == num)
            System.out.println("Number is Palindrome");
        else
            System.out.println("Number is not Palindrome");
    }

    private static int getReverse(int num, int reverse) {
        if(num == 0)
            return reverse;

        int rem = num % 10;
        reverse = reverse * 10 + rem;

        return getReverse(num/10,reverse);
    }
}
