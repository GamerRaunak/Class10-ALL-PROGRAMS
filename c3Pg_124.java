package Class10.Loops_APC;
import java.util.*;
public class c3Pg_124
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value of a: ");
		int a=sc.nextInt();
		double sum=0.0d;
		for(int i=2;i<=20;i+=3)
		{
			sum+=a/(double)i;
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}//end main()
}//end class
