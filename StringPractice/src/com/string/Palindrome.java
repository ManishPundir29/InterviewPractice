package com.string;

public class Palindrome {
public static void main(String[] args) {
    String originalString = "madam	";
    
    StringBuilder strBuilder = new StringBuilder(originalString);
    String reverseString = strBuilder.reverse().toString();

     
   boolean isPalindrame = originalString.equals(reverseString);
    
   System.out.println(isPalindrame);    //true
}
}
