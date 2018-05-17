import java.util.*;
import java.io.*;
class oddineven
{
	public static void main (String[] args)
	{
		Scanner	in=new Scanner(System.in);
		int n=in.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		{
		a[i]=in.nextInt();
		if((i%2)!=(a[i]%2))
		System.out.print(a[i]+" ");
		}
	}
}
