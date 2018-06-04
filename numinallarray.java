import java.util.*;
import java.io.*;
class numinallarray
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n,j,k,l,m,h,count=0,i;
        n=sc.nextInt();
        k=sc.nextInt();
        l=n;
        int a[][]=new int[n][k];
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<k;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        i=0;
        for(j=0;j<k;j++)
                {
                    count=1;
                    for(l=i+1;l<n;l++)
        		    {
        		        for(m=0;m<k;m++) 
        			    {
                            if(a[i][j]==a[l][m])
                            {
                                count++;
                                break;
                            }
                        }
                    }
                    if(count==n)
                    {
                        System.out.print(a[i][j]+" ");
                    }
                }
    }
}
