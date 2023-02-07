package SrringProgramsofJava;
import java.util.*;
public class PigLatin
{
	public static void main(String args[])
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the word");
			String str=sc.next();
			str=str.toUpperCase();
			int len=str.length();
			int i=0;
			for(i=0;i<len;i++)
			{
				char ch=str.charAt(i);
				if("AEIOU".indexOf(ch)>0)
					break;
			}
			String nwrd=str.substring(i)+str.substring(0,i)+"AY";
			System.out.println("Old word: "+str);
			System.out.println("New word: "+nwrd);
			sc.close();
		}
	}
}
