package Palindrome;

public class PalindromeCheck {
    public boolean isPalindrome(String str) {
        char[] charArray = str.toCharArray();
        char[] reversedArray = new char[charArray.length];

        // Reverse the original char array
        for (int i = 0; i < charArray.length; i++) {
            reversedArray[i] = charArray[charArray.length - 1 - i];
        }

        // Compare the original and reversed char arrays
        for (int i = 0; i < charArray.length; i++) {
            if (charArray[i] != reversedArray[i]) {
                return false; // Not a palindrome
            }
        }
        return true; // Palindrome
    }
}
