import java.util.Scanner;

public class ArmstrongInGivenRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower and upper range:");
        int lower = sc.nextInt();
        int upper = sc.nextInt();
        System.out.println("Armstrong Number from " + lower + " and " + upper + " are :");

        for (int num = lower; num <= upper; num++) {
            int sum = 0, temp, digit, len;
            len = getOrder(num);
            temp = num;
            while (temp != 0) {
                digit = temp % 10;
                sum = sum + (int) Math.pow(digit, len);
                temp = temp / 10;
            };
            if (sum == num)
                System.out.print(num + " ");
        }
    }

    private static int getOrder(int num) {
        int len = 0;
        while (num != 0) {
            len++;
            num = num / 10;
        }
        ;
        return len;
    }

}