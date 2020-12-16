import java.io.*;
import java.util.*;
public class test
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		int count=0;
		for(int i=0;i<=n-1;i++)
		{
			arr[i]=s.nextInt();
			if(arr[i]<=0)
			{
				count=0;
			}
			else if(arr[i]>=arr[k])
			{
				count++;
			}
		}
		System.out.print(count);

	}
}