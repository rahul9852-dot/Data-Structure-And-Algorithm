// java program to copy one String From another.

import java.io.*;
import java.util.*;
class copy
{
	public static void mycopy(char s1[], char s2[])
	{
		int i=0;
		for( i=0;i<s1.length;i++)
		{
			s2[i]=s1[i];
		}
	}
	public static void main (String [] args)throws Exception
	{
		//BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		//String str=br.readLine();
		char s1[]="Rahul".toCharArray();
		char s2[]=new char[s1.length];
		mycopy(s1,s2);
		System.out.println(String.valueOf(s2));
	}
}