package com.string;

import java.util.HashSet;
import java.util.Set;

public class StringPermutation {
	public static void main(String[] args) {
		System.out.println(getPermutations("ABC")); 
	        //Prints
	        //[ACB, BCA, ABC, CBA, BAC, CAB]
	 }

	 public static Set<String> getPermutations(String string) {
		//All permutations
        Set<String> permutationsSet = new HashSet<String>();
         
        // invalid strings
        if (string == null || string.length() == 0) 
        {
            permutationsSet.add("");
        } 
        else
        {
            //First character in String
            char initial = string.charAt(0); 
             
            //Full string without first character
            String rem = string.substring(1); 
             
            //Recursive call
            Set<String> wordSet = getPermutations(rem);
             System.out.println(wordSet);
            for (String word : wordSet) {
                for (int i = 0; i <= word.length(); i++) {
                	System.out.println("word:"+word+",Initial:"+initial+",index:"+i);
                    permutationsSet.add(charInsertAt(word, initial, i));
                }
            }
        }
        return permutationsSet;
	}
	public static String charInsertAt(String word, char c, int position) 
    {
        String begin = word.substring(0, position);
        String end = word.substring(position);
        System.out.println(begin+":"+c+":"+end);
        return begin + c + end;
    }
}
