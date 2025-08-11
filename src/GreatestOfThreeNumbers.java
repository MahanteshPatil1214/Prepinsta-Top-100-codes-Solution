public class GreatestOfThreeNumbers {
    public static void main(String[] args) {
        int a =10 ;
        int b = 23;
        int c = 4 ;

        //By Using if-else statement
        if ((a>b) && (a>c))
            System.out.println(a + " is greatest");
        else if ((b>a) && (b>c)) {
            System.out.println(b + " is greatest");
        } else if ((c>a) && (c>b)) {
            System.out.println(c + " is greatest");
        }

        // By Using if-else statement
        if ((a>b) && (a>c))
            System.out.println(a + " is greatest");
        else if ((b>c)) {
            System.out.println(b + " is greatest");
        } else  {
            System.out.println(c + " is greatest");
        }

        //By Using ternary operator
        int temp,result;
        temp = a>b ? a : b;
        result = temp > c ? temp : c ;
        System.out.println(result + " is greatest");


    }
}
