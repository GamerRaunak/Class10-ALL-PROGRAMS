package APC_String_prog;
import java.util.*;
public class Q13_IX_290
{
	public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String str = sc.nextLine();
		 str=str.toLowerCase();
		 String nstr = "";
		 String v="aeiou";
		 char ch;
		 int len = str.length();
		 for (int i = 0; i < len; i++)
		 {
			 ch=str.charAt(i);
			 if(v.indexOf(ch)<0)
				 nstr+=ch;
			 else
				 nstr+=(char)(ch+1);
		 }
		 System.out.println(nstr);
		 sc.close();
	 }
}
