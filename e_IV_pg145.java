package Class10.Loops_APC;
import java.util.*;
public class e_IV_pg145
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		System.out.println("Enter value of a");
		int a=sc.nextInt();
		double sum=0.0d;
		for(int i=2,k=3;i<=n;i++,k+=2)
		{
			sum+=k/Math.pow(a, i);
		}
		sum=sum+2/a;
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
