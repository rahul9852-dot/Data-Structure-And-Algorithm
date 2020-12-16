import java.io.*;
import java.util.*;
class operation
{
	public static int min(int n)
	{	
		if(n==1)
			return 0;
		else if(n%2==0)
			return 1+min(n/2);
		else
			return 1+Math.min(min(n-1),min(n+1));
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			System.out.print(min(n));
			System.out.println();
			
		}

	}
}