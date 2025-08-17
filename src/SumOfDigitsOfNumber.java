public class SumOfDigitsOfNumber {
    public static void main(String[] args) {

        int num = 1235;

        int sum = 0;
        System.out.println("Number :" + num);
        while (num != 0) {
            sum += num % 10;
            num = num / 10;
        }
        System.out.println("The Of Sum Digits :" + sum );

    }
}