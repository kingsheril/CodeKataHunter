import java.io.*;
import java.util.*;

class solonum
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
int n=in.nextInt();
int[] a=new int[n];
for(int i=0;i<n;i++)
a[i]=in.nextInt();
int c;
for(int i=0;i<n;i++)
{
c=0;
for(int j=0;j<n;j++)
{
if((i!=j)&&(a[i]==a[i]))
c++;
}
if(c==0){
System.out.print(a[j]);
break;
}
}
}
}
