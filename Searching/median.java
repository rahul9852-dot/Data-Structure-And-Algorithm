import java.io.*;
import java.util.*;
class median
{
	public static int findmedian(int arr[],int n)
	{
		Arrays.sort(arr);
		if(n%2!=0)
			return arr[n/2];
		return (arr[(n-1)/2]+arr[n/2])/2;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		int size=arr.length;
		System.out.println("Median="+findmedian(arr,n));
	}
}