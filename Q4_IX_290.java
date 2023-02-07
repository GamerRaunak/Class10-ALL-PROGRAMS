package APC_String_prog;
import java.util.*;
public class Q4_IX_290
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter three word name:");
		String str=sc.nextLine();
		str=str.trim();
		str=str.toUpperCase();
		String nstr="";
		/*String fstr=str.substring(str.lastIndexOf(' ')+1);
		String sstr=str.substring((str.indexOf(' ')+1),(str.lastIndexOf(' ')));
		String tstr=str.substring((str.charAt(0)),(str.indexOf(' ')));
		nstr=fstr+sstr+tstr;
		System.out.println("New String:"+nstr);
		...wrong*/
		int lastSpaceIdx = str.lastIndexOf(' ');
	       
	       String surname = str.substring(lastSpaceIdx + 1);
	       String initialName = str.substring(0, lastSpaceIdx);
	       System.out.println(surname + " " + initialName);
	       sc.close();
	}
//correct
}
