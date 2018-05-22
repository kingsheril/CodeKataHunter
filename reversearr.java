import java.util.*;
import java.io.*;
class reversearr
{
	public static void main (String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
		}
		for(int i=n-1;i>=0;i--)
		{
			System.out.print(a[i]);
			if(i!=0)
			System.out.print("->");

		}
	}
}
