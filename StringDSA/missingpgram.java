// Missing charcter to make a string Pangram.

import java.io.*;
import java.util.*;

class missingpgram
{
	public static void missingchar(String str)
	{
		boolean tmp[]=new boolean[26];
		
		//int idx=0;
		for(int i=0;i<str.length();i++)
		{
			if('A'<=str.charAt(i)&& str.charAt(i)<='Z')
			{
				tmp[str.charAt(i)-'A']=true;
			}
			else if('a'<=str.charAt(i)&& str.charAt(i)<='z')
			{
				tmp[str.charAt(i)-'a']=true;
			}
		}
		
		for(int i=0;i<=25;i++)
		{
			if(tmp[i]==false)
			{
				System.out.print(tmp[i]+" ");
			}
		}
		
	}
	public static void main(String[]args)throws Exception
	{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		String str=br.readLine();
		missingchar(str);
		
	}
}