import java.io.*;
import java.util.*;

class Secsmall
{
  public static void main(String[] args)
  {
    Scanner in=new Scanner(System.in);
    int n=in.nextInt();
    int m=in.nextInt();
    int[] a=new int[n];
    for(int i=0;i<n;i++)
      a[i]=in.nextInt();
    int k;
    int[] r=new int[n];
    for(int i=0;i<n;i++)
    {
      k=1;
      for(int j=0;j<n;j++)
      {
        if(a[i]<a[j])
        k++;
      }
      r[n-k]=a[i];
    }
    System.out.print(r[m-1]);
  }
}
