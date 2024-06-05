```
# Palindrome

## Description
This Java package provides a method to check whether a given string is a palindrome.

## Method
The `isPalindrome` method reverses an array and compares the original and reversed arrays to determine if the input string is a palindrome.

- If the string is a palindrome, the method returns `true`.
- If the string is not a palindrome, the method returns `false`.

## How It Works
1. Convert the input string into a character array.
2. Create a reversed version of the character array.
3. Compare each character in the original array with the corresponding character in the reversed array.
4. If any characters don't match, return `false`; otherwise, return `true`.
```