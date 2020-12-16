import java.io.*;
import java.util.*;
class numrequired
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int arr[]=new int[n];
		int size=arr.length;
		for(int i=0;i<n;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.print(search(arr,size,x));
		

		
	}
	public static int search(int arr[],int n,int x)
	{
		Arrays.sort(arr);
		int cnt=0;
		while(arr[(n)/2]!=x)
		{
			arr[n]=x;
			n++;
			Arrays.sort(arr);
			cnt++;
		}
		return cnt;
	}
}