public class ReverseTheNumber {
    public static void main(String[] args) {
        int num = 12345 ,reverse = 0 ,rem;
        System.out.println("Number:" + num);
        while(num != 0) {
            rem = num % 10;
            reverse = reverse * 10 + rem;
            num = num / 10;
        }

            System.out.println("Reverse Number:" + reverse);
    }
}

