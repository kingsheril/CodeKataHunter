import java.util.*;
import java.lang.*;
import java.io.*;
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner in=new Scanner(System.in);
		int n,t,c=0;
		n=in.nextInt();
		int[] a=new int[n];
		int[] r=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=in.nextInt();
			for(int j=0;j<i;j++)
			{
				if(a[i]==a[j])
				{
					r[c]=a[i];
					c++;
				}
			}
		}
        Arrays.sort(r);
        for (int i=0;i<n;i++)
        {
        	if(r[i]==0)
            continue;
            System.out.print(r[i]+" ");
        }	
        	
        }
}
