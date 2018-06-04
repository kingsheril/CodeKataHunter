import java.util.*;
import java.io.*;
class nearestneighbour
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		int n=in.nextInt();
		int k=in.nextInt();
		int t,max,min,r=0,m=0;
		int[] a=new int[n];
		for(int i=0;i<n;i++)
		a[i]=in.nextInt();
		for(int i=1;i<=3;i++)
		{
			t=1000;
			for(int j=0;j<n;j++)
			{
				max=a[j];
				min=k;
				if(a[j]<k)
				{
					max=k;
					min=a[j];
				}
				if((max-min)<t&&(a[j]!=k))
				{
					if((max-min)>m)
					{
						t=max-min;
						r=a[j];
					}
				}
			}
			System.out.print(r+" ");
			m=t;
		}
		
	}
}
