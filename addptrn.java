import java.util.*;
import java.io.*;
class addptrn
{
	public static void main (String[] args)
	{
		Scanner	in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				for(int k=0;k<n;k++)
				{
					if((a[i]+a[j])==a[k]&&(i<j&&j<k))
					{
						System.out.println(a[i]+" "+a[j]+" "+a[k]);
					}
				}
			}
		}
	}
}
