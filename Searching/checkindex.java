import java.io.*;
import java.util.*;
class checkindex
{

	public static int index(int arr[],int target)
	{
		for(int i=0;i<nums.length;i++)
			for(int j=i+1;j<nums.length;j++)
				if(nums[j]==target-nums[i])
					return new int[] {i,j};
		
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int x=s.nextInt();
		int nums[]=s.nextInt();
		for(int i=0;i<n;i++)
		{
			nums[i]=s.nextInt();
		}
		System.out.print(index(nums,x));
	}
}