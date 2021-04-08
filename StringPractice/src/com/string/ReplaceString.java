package com.string;

public class ReplaceString {
	public static void main(String[] args) {
		String originalString = "howtodoinjava hoho";
		 
		//Replace one character
		System.out.println( originalString.replace("h", "H") );         //Howtodoinjava
		 
		//Replace all matching characters
		System.out.println( originalString.replaceAll("o", "O") );      //hOwtOdOinjava
		 
		//Remove one character
		System.out.println( originalString.replace("h", "") );         //owtodoinjava
		 
		//Remove all matching characters
		System.out.println( originalString.replace("o", "") );         //hwtdinjava
	}
}
