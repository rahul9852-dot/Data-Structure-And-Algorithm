import java.io.*;
import java.util.*;
class test
{
	public static int sum(int M,int N)
	{
		if(M<N)
		{
			return sum(N,M);
		}
		else if(N!=0)
			return M+sum(M,N-1);
		else
			return 0;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		System.out.print(sum(n1,n2));
	}
}