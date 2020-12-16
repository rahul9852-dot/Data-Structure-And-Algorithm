// Recursive approach to copy one string in to another string

import java.io.*;
import java.util.*;
class recursivecopy
{
	// Recursive function
	public static  void Copystring(char str1[],char str2[],int idx)
	{
		if(idx==str1.length)
		{
			return;
		}
		str2[idx]=str1[idx];
		Copystring(str1,str2,idx+1);
		
		
	}
	
	public static void main(String[]args)throws Exception{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String str=reader.readLine();
		char s1[]=str.toCharArray();
		char s2[]=new char[s1.length];
		int idx=0;
		Copystring(s1,s2,idx);
		System.out.println(String.valueOf(s2));
		
		
		
		
	}
}