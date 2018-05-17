import java.util.*;
import java.io.*;
class subset
{
	public static void main (String[] args)
	{
		Scanner	in=new Scanner(System.in);
		int n1=in.nextInt();
		int n2=in.nextInt();
		int[] a=new int[n1];
		for(int i=0;i<n1;i++)
		a[i]=in.nextInt();
		int[] b=new int[n2];
		for(int i=0;i<n2;i++)
		b[i]=in.nextInt();
		int c=0;
		for(int i=0;i<n1;i++)
		{
			for(int j=0;j<n2;j++)
			{
				if(a[j]==a[i])
				{
					c++;
					break;
				}
			}
		}
		if(c==n2)
		System.out.print("YES");
		else
		System.out.print("NO");
	}
}
