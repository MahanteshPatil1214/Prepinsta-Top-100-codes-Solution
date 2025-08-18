public class ArmstrongNumber {
    public static void main(String[] args) {
        int num = 1415 , len ;
        len = order(num);

        if(armStrong(num,len))
            System.out.println(num + " is Armstrong Number.");
        else
            System.out.println(num + " is not Armstrong Number.");

    }

    private static boolean armStrong(int num, int len) {
        int sum = 0 ,temp,digit;
        temp = num ;
        while (temp != 0){
            digit = temp % 10;
            sum = sum + (int)Math.pow(digit,len);
            temp = temp / 10;
        };
        return num == sum ;
    }

    private static int order(int num) {
        int len = 0;
        while (num !=0){
            len ++ ;
            num = num / 10;
        };
        return  len;
    }
}
