import java.util.*;
import java.io.*;
class strrevers
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		String[] st=s.split(" ");
		for (String i : st)
		{
			StringBuffer sb=new StringBuffer(i);
			System.out.print(sb.reverse().toString()+" ");
		}
	}
}
