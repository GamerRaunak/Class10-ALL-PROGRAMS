package Class10.anonymous;
import java.util.*;
public class seriesPG_115
{
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms");
		int n=sc.nextInt();
		double sum=0.0d;
		for(int i=1;i<=n;i++)
		{
			if(i%2==0)
			sum-=(double)i/(i+1);
			else
			sum+=(double)i/(i+1);
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
