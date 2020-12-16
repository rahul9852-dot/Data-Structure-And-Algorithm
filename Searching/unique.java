import java.io.*;
import java.util.*;
class unique
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int m=s.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[m];
		for(int i=0;i<n;i++)
			arr1[i]=s.nextInt();
		for(int j=0;j<m;j++)
			arr2[j]=s.nextInt();
		System.out.print(searchele(arr1,arr2,0));
				
	}
	public static int[] searchele(int arr1[],int arr2[],int total[])
	{
		for(int i=0;i<arr1.length-1;i++)
			for(int j=0;j<arr2.length-1;j++)
				if(arr1[i]!=arr2[j]&&arr2[j]!=arr1[i])
				{
					total=arr1[i];
					total=arr2[j];
				}
		return total;
	}
}