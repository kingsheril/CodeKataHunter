import java.util.*;
import java.io.*;
class strrevers
{
	public static void main (String[] args)
	{
		Scanner in=new Scanner(System.in);
		String s=in.nextLine();
		StringBuffer st=new StringBuffer(s);
		System.out.println(st.reverse().toString());
	}
}
