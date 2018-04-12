import java.util.*;
import java.lang.*;
import java.io.*;
class grnumber
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int i=0;
		int n=in.nextInt();
		int[] a=new int[15];
		while(n!=0)
		{
			a[i]=(n%10);
			n=n/10;
			i++;
		}
		for(int j=0;j<=i;j++)
		{
			for(int k=0;k<=i;k++)
			{
				if(a[j]>a[k])
				{
				int t=a[j];
				a[j]=a[k];
				a[k]=t;
			}
			}
		}
		for(int j=0;j<i;j++)
		{
		System.out.print(a[j]);
		}
	}
}
