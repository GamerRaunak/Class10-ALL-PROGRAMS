package APC_String_prog;
import java.util.*;
public class Q23_IX_292
{
	public static void main(String args[])
	 {
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Emter 1 for triangle 1");
		 System.out.println("Enter 2 for triangle 2");
		 int ch=sc.nextInt();
		 switch(ch)
		 {
		 case 1:
			 
			 String s="BLUEJ";
			 for(int i=0;i<s.length();i++)
			 {
				 for(int j=0;j<=i;j++)
					 System.out.print(s.charAt(i)+" ");
					 
				System.out.println();
			 }
			 break;
		 case 2:
			 s="BLUEJ";
			 for(int i=s.length()-1;i>=0;i--) {
				 for(int j=0;j<=i;j++)
					 System.out.print(s.charAt(j)+" ");
			 System.out.println();
			 }
		 }
		 
	 }

}
