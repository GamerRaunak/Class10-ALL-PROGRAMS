package APC_String_prog;
import java.util.*;
public class Q3_IX_290
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three word name:");
		String str=sc.nextLine();
		str=str.toUpperCase();
		String nstr="";
		char ch;
		char fi=str.charAt(0);
		char si=str.charAt(str.indexOf(' ')+1);
		char ti=str.charAt(str.lastIndexOf(' ')+1);
		nstr=fi+" "+si+" "+ti;
		System.out.println("Initials= "+nstr);
		//for(int i=0;i<str.length();i++)
		//{	
		//}
		sc.close();
	}
}
