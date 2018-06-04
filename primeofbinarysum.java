import java.util.*;
import java.io.*;
class primeofbinarysum
{
	static int temp=0;
	public static void main(String[] args) 
	{
		int A,B,i,total = 0;
		Scanner sc=new Scanner(System.in);
		A=sc.nextInt();
		B=sc.nextInt();
		for(i=A;i<B;i++)
		{
		     int add=binaryAdd(i);
		     total=total+primeCheck(add);
		}
		System.out.print(total);
	}
	static int binaryAdd(int x)
	{
		int num=x,add=0;
		if(num!=0&&num!=1)
		{
			while(num!=0)
			{
				add=add+num%2;
				num/=2;
			}
			return add;
		}
		return 0;
	}
	static int primeCheck(int x)
	{
		int i,count=0;
		for(i=1;i<=x;i++)
		{
			if(x%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			return 1;
		}
		return 0;
	}
	
}
