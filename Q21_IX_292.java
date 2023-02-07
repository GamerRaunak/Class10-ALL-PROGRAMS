package APC_String_prog;
import java.util.*;
public class Q21_IX_292
{
	public static void main(String args[])
	 {
		 //Scanner sc = new Scanner(System.in);
		 String s="ABCDE";
		 for(int i=0;i<s.length();i++)
		 {
			 for(int j=i;j<s.length();j++)
				 System.out.print(s.charAt(j));
			 System.out.println();
		 }
	 }

}
