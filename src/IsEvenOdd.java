public class IsEvenOdd {
    public static void main(String[] args) {
        int num = 7;

        //By Using Brute Force Approach
        if(num % 2 == 0)
            System.out.println(num + " Is Even");
        else
            System.out.println(num + " Is odd");

        //By Using Ternary Operator Approach
        String result = (num%2==0) ? "Is Even" : "Is Odd" ;
        System.out.println(num +" "+ result);

        //By Using Bitwise '&' Operator Approach
        if(isEven(num))
            System.out.println(num + " Is Even");
        else
            System.out.println(num + " Is Odd");
    }

        static boolean isEven(int num) {
           return (num & 1) == 0;
        }

}

