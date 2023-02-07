package Class10.Loops_APC;
import java.util.Scanner;
public class d1Pg_124
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of terms: ");
		int n=sc.nextInt();
		int term=1;
		for(int i=1;i<=n;i++)
		{
			if(i!=n)
				System.out.print(term+" ");
			else
				System.out.print(term);
			term=term*10+1;
		}
		sc.close();
	}
}
