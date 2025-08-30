public class StrongNumber {
    public static void main(String[] args) {
        int num =145;
        if(detectStrong(num))
            System.out.println("Strong Number");
        else
            System.out.println(" Not Strong Number");
    }

    private static boolean detectStrong(int num) {
        int digit , sum = 0;
        int temp = num;
        boolean flag = false;
        while (temp!=0){
            digit = temp % 10;
            sum = sum + fact(digit);
            temp /=10;
        }
        if(sum == num)
            flag = true;

        return flag;
    }

    private static int fact(int num){
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact * i;
        }
        return fact;
    }

}
