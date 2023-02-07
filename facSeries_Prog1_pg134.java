package Class10.Loops_APC;
import java.util.*;
public class facSeries_Prog1_pg134
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of terms: ");
		int n=sc.nextInt();
		int f=1;double sum=0.0d;
		for(int i=1;i<=n;i++)
		{
			f=1;
			for(int j=i;j<=i;j++)
				f=f*j;
			sum+=1/(double)f;
		}
		System.out.println("Sum = "+sum);
		sc.close();
	}
}
