package APC_String_prog;
import java.util.*;
public class Q7_IX_290 
{
	 public static void main(String args[])
	 {
		 Scanner in = new Scanner(System.in);
		 System.out.println("Enter a string in uppercase:");
		 String str = in.nextLine();
		 String newStr = "";
		 String u="AEIOU";
		 int len = str.length();
		 for (int i = 0; i < len; i++)
		 {
		    char ch = str.charAt(i);
		    if (u.indexOf(ch)<0)
		    	newStr = newStr + ch;
		     else
		    	 newStr = newStr + '*';
		 }  
		System.out.println(newStr);
	 }
}
