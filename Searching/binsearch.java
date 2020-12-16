import java.io.*;
import java.util.*;
class binsearch
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print(search(arr,k));
		
	}
	public static int search(int arr[],int k)
	{
		int l=0;
		int h=arr.length-1;
		while(l<=h)
		{
			int m=l+(h-1)/2;
			if(arr[m]==k)
				return m+1;
			else if(arr[m]<k)
				l=m+1;
			else
				h=m-1;
		}
		return -1;
	}
}