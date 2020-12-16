// Java code to illustrate different constructor and methods
// String Class

import java.io.*;
import java.util.*;

class Basic{
	public static void main(String[] args){
		String s="GeeksForGeeks";
		
		// return the number of charcter at ith index.
		
		System.out.println("String length="+s.length());
		
		// return the Charcter at ith index.
		
		System.out.println("Charcter at 3rd position="+s.charAt(3));
		
		// return the substring from ith index Charcter to end of string.
		
		System.out.println("Substring "+s.substring(3));
		
		// return the substring from i to j-1 index.
		
		System.out.println("Substring ="+s.substring(2,5));
		
		// Concatenates string2 to the end of string1.
		
		String s1="Geeks";
		String s2="ForGeeks";
		
		System.out.println("Concatenated String ="+s1.concat(s2));
		
		// return the index within the string 
		// of the first occurences  of the specified string.
		
		String s4="Learn Share Learn";
		
		System.out.println("Index of Share "+ s4.indexOf("Share"));
		
		System.out.println("Index of a="+s4.indexOf('a',3));
		
		// Check Equality
		
		
		boolean out="Geeks".equals("geeks");
		
		System.out.println("Checking Equality "+out);
		
		out="Geeks".equals("Geeks");
		
		System.out.println("Checking Equality "+out);
		
		out="Geeks".equalsIgnoreCase("gEeks");
		System.out.println("Checking Equality "+out);
		
		// If ASCII difference is zero then two String are similiar.
		
		int out1=s1.compareTo(s2);
		
		System.out.println("the difference between ASCII value is="+out1);
	}
}