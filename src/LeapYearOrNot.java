public class LeapYearOrNot {
    public static void main(String[] args) {
        int year = 2025;

        //By using If-else Statement
        if(year % 400 == 0)
            System.out.println(year + " is leap year.");
        else if (year % 4 == 0 && year % 100 !=0)
            System.out.println(year + " is leap year.");
        else
            System.out.println(year + " is not leap year.");

        //By using If-else Statement
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0))
            System.out.println(year + " is a leap Year.");
        else
            System.out.println(year + " is not leap year.");

        //By using Ternary Operator
        int flag = (year % 400 == 0 || (year % 4 == 0 && year % 100 !=0)) ? 1 : 0;
        if(flag == 1)
            System.out.println(year + " is a leap Year.");
        else
            System.out.println(year + " is not leap year.");



    }
}
