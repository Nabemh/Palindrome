<h1>Palindrome</h1>

<h2>Description</h2>
<p>This Java package provides a method to check whether a given string is a palindrome.</p>

<h2>Group Members</h2>
<ul>
  <li>Hanior Nabem Nathaniel - BHU/22/04/09/0074</li>
  <li>Ezekiel Oyidih - BHU/22/04/05/0026</li>
  <li>Ngakilahyel Samuel - BHU/22/04/10/0019</li>
  <li>Caleb Joshua Fuojima - BHU/22/04/05/0018</li>
  <li>Precious Oguntuase Toluwalope - BHU/22/04/05/0070</li>
</ul>

<h2>Method</h2>
<p>The <code>isPalindrome</code> method reverses an array and compares the original and reversed arrays to determine if the input string is a palindrome.</p>
<ul>
  <li>If the string is a palindrome, the method returns <code>true</code>.</li>
  <li>If the string is not a palindrome, the method returns <code>false</code>.</li>
</ul>

<h2>Algorithm</h2>
<ol>
  <li>Take the string as input.</li>
  <li>Convert the input string into a character array by breaking it character for character.</li>
  <li>Create an empty character array of the same length as the input string.</li>
  <li>Loop through each character of the input string:
    <ul>
      <li>Assign the character at the current index of the input string to the corresponding index in the empty character array in the other direction.</li>
    </ul>
  </li>
  <li>Compare each character of the original input string with the corresponding character in the reversed array:
    <ul>
      <li>If any character does not match, return <code>false</code> (indicating that the string is not a palindrome).</li>
    </ul>
  </li>
  <li>If all characters match, return <code>true</code> (indicating that the string is a palindrome).</li>
</ol>

