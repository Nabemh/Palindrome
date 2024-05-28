package Palindrome;

public class Main {
    public static void main(String[] args) {
        PalindromeCheck palindromeChecker = new PalindromeCheck();
        String str = "Tunde Ednut";
        if (palindromeChecker.isPalindrome(str)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }
    }
}
