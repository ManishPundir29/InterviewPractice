package com.string;

import java.util.Arrays;

public class ReverseEachWordString {
	public static void main(String[] args) {
		String blogName = "how to do in java dot com";
		 
		//spilt on white space
		String[] tokens = blogName.split(" ");
		 
		//It will store reversed words 
		StringBuffer finalString = new StringBuffer();
		 
		//Loop all words and reverse them
		for (String token : tokens) {
		    String reversed = new StringBuffer(token).reverse().toString();
		    finalString.append(reversed);
		    finalString.append(" ");
		}
		 
		//Check final string
		System.out.println(blogName.length());
		System.out.println(finalString.toString());   
		
		String numbers = "1,2,3,4,5,6,7";
        
		String[] numArray = numbers.split(",");
		numbers = Arrays.toString(numArray);
		System.out.println(numbers);  //[1, 2, 3, 4, 5, 6, 7]
	}
}
