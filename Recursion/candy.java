import java.io.*;
import java.util.*;
class candy
{
	public static int crush(long n)
	{
		if(n==0)
		{
			return 0;
		}
		long group=0;
		if(n%3==0)
		{
			group=n/3;
		}
		else
		{
			group=(n/3)+1;
		}
		long dollar=group*group;
		return dollar+crush(n-group);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			long dollar=crush(n);
			System.out.println(crush(dollar));
			
		}
		
	}
}