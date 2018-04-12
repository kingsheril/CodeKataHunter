import java.util.*;
import java.lang.*;
import java.io.*;
public class grnumber1
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[15];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			for(int k=0;k<n;k++)
			{
				if(a[j]>a[k])
				{
				int t=a[j];
				a[j]=a[k];
				a[k]=t;
			}
			}
		}
		for(int j=0;j<n;j++)
		{
		System.out.print(a[j]);
		}
	}
}
