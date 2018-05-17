import java.util.*;
import java.io.*;
class difftozero
{
	public static void main (String[] args)
	{
		Scanner	in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		int t1=0,t2=0,c=10;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if((a[i]+a[j])==0)
				{
					System.out.println(a[i]+" "+a[j]);
					System.exit(0);
				}
				if(i!=j&&(a[i]+a[j])<c)
				{
				c=(a[i]+a[j]);
				t1=a[i];
				t2=a[j];
				}
			}
		}
		System.out.println(t1+" "+t2);
	}
}
