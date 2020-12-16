import java.io.*;
import java.util.*;
class fibonacci
{
	public static int fib(int n)
	{
		if(n==1)
			return 0;
		else if(n==2)
			return 1;
		else
			return fib(n-1)+fib(n-2);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
		int n=s.nextInt();
		System.out.print(fib(n));
		}
	}
}