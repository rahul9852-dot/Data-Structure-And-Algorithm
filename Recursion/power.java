import java.io.*;
import java.util.*;
class power
{
	public static int raise(int n,int p)
	{
		if(p==0)
			return 1;
		else if(p%2==0)
			return raise(n,p/2)*raise(n,p/2);
		else
			return n*raise(n,p/2)*raise(n,p/2);
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int t=s.nextInt();
		while(t-->0)
		{
			int n=s.nextInt();
			int p=s.nextInt();
			System.out.println(raise(n,p));
			
		}
		
	}
}