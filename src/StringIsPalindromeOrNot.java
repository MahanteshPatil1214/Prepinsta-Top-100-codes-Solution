public class StringIsPalindromeOrNot {
    public static void main(String[] args) {
        String name = "Madam" ;
        boolean result = isPalindrome(name.toLowerCase());
        if(result)
            System.out.println(name + " is Palindrome");
        else
            System.out.println(name + " is not Palindrome");
    }

    private static boolean isPalindrome(String name) {
        String reverse = "";
        int len = name.length();
        for (int i = len - 1 ; i >= 0 ; i--){
            reverse = reverse + name.charAt(i);
        }

        return name.equals(reverse);
    }
}
