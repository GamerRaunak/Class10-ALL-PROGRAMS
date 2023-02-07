package APC_String_prog;
import java.util.*;
public class Q2_IX_289
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string:");
		String str=sc.nextLine();
		String nstr="";
		char ch1;
		for(int i=0;i<str.length();i++)
		{
			ch1=Character.toUpperCase(str.charAt(i));
			if(ch1=='A'||ch1=='E'|ch1=='I'||ch1=='O'||ch1=='U')
				continue;
			
				nstr+=Character.toLowerCase(ch1);
			
		
		}
		System.out.println("New string:"+nstr);
		sc.close();
	}
}
