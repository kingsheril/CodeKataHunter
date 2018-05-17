import java.util.*;
import java.io.*;
class firstrpt
{
	public static void main (String[] args)
	{
		Scanner	in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++){
		a[i]=in.nextInt();
		for(int j=0;j<i;j++)
		{
			if(a[j]==a[i]&&i!=j)
			{
				System.out.print(a[i]);
				j=n;
			}
		}
		}
	}
}
