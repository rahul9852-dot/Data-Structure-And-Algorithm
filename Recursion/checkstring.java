import java.io.*;
import java.util.*;
class reversestr
{
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		String str=s.next();
		char c[]=str.toCharArray();
		reverse(c,0,c.length-1);
		str=new String(c);
		System.out.print(str);
	}
	public static void swap(char[] c,int i,int j)
	{
		char temp=c[i];
		c[i]=c[j];
		c[j]=temp;
	}
	public static void reverse(char[]c,int l,int h)
	{
		if(l<h)
		{
			swap(c,l,h);
			reverse(c,l+1,h-1);
		}
	}
}