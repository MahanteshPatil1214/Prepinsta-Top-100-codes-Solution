public class GreatestOfTwoNumber {
    public static void main(String[] args) {
        int a = 4 ;
        int b = 3 ;

        //By Brute Force Method
        if(a == b)
            System.out.println("Both are equal");
        else if (a > b) {
            System.out.println(a + " is grater");
        }
        else
            System.out.println(b + " is greater");

        //By Ternary Operator
        if(a == b)
            System.out.println("Both are equal");
        else{
           int result = (a > b) ? a : b;
           System.out.println(result + " is greater");
        }

        //By using In built function max()
        if(a == b)
            System.out.println("Both are equal");
        else
            System.out.println(Math.max(a,b) + " is greater");
    }
}
