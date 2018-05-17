import java.util.*;
import java.io.*;
class translate
{
	public static void main (String[] args)
	{
		int n;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		int l = String.valueOf(n).length();
		int c=1,t=l;
		int[] a=new int[l];
		while(n!=0)
		{
			a[t-1]=n%10;
			t--;
			n=n/10;
		}
		for(int i=0;i<l-1;i++)
		{
			if((a[i]+a[i+1])<27)
			{
				for(int j=i+2;j<l-1;j++)
				{
					if((a[i]+a[i+1])<27)
					c++;
				}
			}
		}
		System.out.println(c);
	}
}
