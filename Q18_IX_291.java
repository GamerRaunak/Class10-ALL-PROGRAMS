package APC_String_prog;
import java.util.*;
public class Q18_IX_291
{
	public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter a string:");
		 String str = sc.next();
		 str=str.toUpperCase();
		 String rstr = "";
		 char ch;
		 int len = str.length();
		 for (int i = len-1; i >= 0; i++)
		 {
			 ch=str.charAt(i);
			 rstr+=ch;
		 }
		 if(rstr.equals(str))
			 System.out.println("Palindrome string");
		 else if(str.charAt(0)==str.charAt(len-1))
			 System.out.println("Special string");
		 else
			 System.out.println("Neither a Palindrome or a special string");
		 sc.close();
	 }
}
