package Class10.Loops_APC;
import java.util.*;
public class e1Pg_124
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the no of terms: ");
		int n=sc.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
			
					System.out.print(j);
			}
			System.out.print(", ");
			sc.close();
		}
	}
}
