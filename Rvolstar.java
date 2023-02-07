package SrringProgramsofJava;
import java.util.*;
public class Rvolstar
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String nm=sc.nextLine();
		//String nwrd="";
		//nm.trim();
		for(int i=0;i<nm.length();i++)
		{
			char ch=nm.charAt(i);
			if("AEIOUaeiou".indexOf(ch)>0)
				nm.replace(ch,'*');
		}
		System.out.println(nm);
		sc.close();
	}

}
