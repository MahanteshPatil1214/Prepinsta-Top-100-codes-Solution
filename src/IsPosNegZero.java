public class IsPosNegZero {
    public static void main(String[] args) {
        int num = 2;

        //By Brute Force Method
        if(num > 0)
            System.out.println("Number is Positive");
        else if (num < 0)
            System.out.println("Number is Negative");
        else
            System.out.println("Number is Zero");

        //By Nested if-else
        if(num >= 0){
            if(num == 0)
                System.out.println("Number is Zero");
            else
                System.out.println("Number is Postive");
        }
        else
            System.out.println("Number is Negative");

        //By Ternary Operator
        if(num == 0)
            System.out.println("Number is Zero");
        else{
            String result = (num > 0) ? "Number is Positive" : "Number Is Negative" ;
            System.out.println(result);
        }
    }
}
