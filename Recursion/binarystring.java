import java.io.*;
import java.util.*;
class binarystring
{
	public static void main(String[] args)
	{
		//Scanner s=new Scanner(System.in);
		//String str=s.next();
		char pattern[]="1?11?00?1?".toCharArray();
		allcombination(pattern,0);
		
	}
	public static void allcombination(char[] pattern,int i)
	{
		if(i==pattern.length)
		{
			System.out.print(pattern);
			System.out.println();
			return;
		}
		if(pattern[i]=='?')
		{
			for(char ch='0';ch<='1';ch++)
			{
				pattern[i]=ch;
				allcombination(pattern,i+1);

				pattern[i]='?';
			}
			return;

		
		}
		allcombination(pattern,i+1);
	}
}