import java.io.*;
import java.util.*;

class sum
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		System.out.print(fun(x,y));
	}
	public static int fun(int x,int y)
	{
		if(x==0)
		{
			return y;
		}
		else
		{
			return fun(x-1,x+y);
		}
	}
}