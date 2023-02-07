package Class10.anonymous;
import java.util.*;
public class AutomorphicNumber
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
        int a=sc.nextInt();
        int sq_a=a*a;
        int temp=a,l=0;
        while(temp>0)//temp>1
        {
            temp=temp/10;
            l++;
        }
        int endDig=sq_a%(int)Math.pow(10,l);
        if(a==endDig)
        System.out.println(a+" is an Automorphic Number.");
        else
        System.out.println(a+" is not an Automorphic Number.");
        sc.close();
	}
}
