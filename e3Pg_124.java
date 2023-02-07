package Class10.Loops_APC;
import java.util.*;
public class e3Pg_124
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		System.out.println("Enter the value of a: ");
		int a=sc.nextInt();
		double sum=0.0d;
		for(int i=1,k=1;i<=n;i++,k+=2)
		{
			if(i%2==0)
				sum=sum-Math.pow(a, k);
			else
				sum=sum+Math.pow(a, k);
		}
		
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
