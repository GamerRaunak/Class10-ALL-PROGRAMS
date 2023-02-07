package Class10.anonymous;
import java.util.*;
public class NeonNumber
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int sqN=num*num;
		int z=0,sum=0;
		while(sqN>0)
		{
			z=sqN%10;
			sum+=z;
			sqN=sqN/10;
		}//end while
		if(sum==num)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");
		sc.close();
	}//end main()
}//end class
