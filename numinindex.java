import java.util.*;
import java.lang.*;
import java.io.*;
class numinindex
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			if(a[i]==i)
			System.out.print(i+" ");
		}
	}
}
