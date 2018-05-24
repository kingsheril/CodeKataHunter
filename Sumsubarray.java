import java.util.*;
import java.io.*;
class Sumsubarray
{
	public static void main (String[] args)
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int sum,t=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		for(int i=0;i<n;i++)
		{
			sum=0;
			for(int j=i;j<n;j++)
			{
				sum=sum+a[j];
				if(sum>t)
				t=sum;
			}
		}
		System.out.print(t);
	}
}
