package APC_String_prog;
import java.util.*;
public class Q6_IX_290
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.next();
		//String nstr="";
		char ch1;
		int ascii=0;
		for(int i=0;i<str.length();i++)
		{
			ch1=str.charAt(i);
			ascii=(int)ch1;
			System.out.println("ASCII of "+ch1+": "+ascii);
		}
	}
}
