package Class10.anonymous;
import java.util.*;
public class PalindromeWrd
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the word: ");
        String wrd=sc.next();
        wrd=wrd.trim();
        wrd=wrd.toUpperCase();
        String rwrd="";
        for(int i=wrd.length()-1;i>=0;i--)
        {
            char ch=wrd.charAt(i);
            rwrd+=ch;
        }
        if(rwrd.equals(wrd)){
        System.out.println("Palindrome Word");
        System.exit(0);
        }
        else if(wrd.charAt(0)==wrd.charAt(wrd.length()-1))
        System.out.println("Special Word");
        else
        System.out.println("Neither a Special Word nor a Palindrome Word");
        sc.close();
    }    
}
