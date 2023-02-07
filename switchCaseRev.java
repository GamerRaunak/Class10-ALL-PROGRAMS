package Class10.anonymous;
import java.util.*;
public class switchCaseRev
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double p=0.0d,r=0.0d,A=0.0d;int n=0;
		System.out.println("Enter 'a' for Term Deposit");
		System.out.println("Enter 'b' for Recurring Deposit");
		char ch=sc.nextLine().charAt(0);
		switch(ch)
		{
		case 'a':
		case 'A':
			System.out.println("Enter principal amount");
			p=sc.nextDouble();
			System.out.println("Enter rate of interest");
			r=sc.nextDouble();
			System.out.println("Ente rthe time period in months");
			n=sc.nextInt();
			A=p*(Math.pow(1+r/100,n));
			System.out.println("Maturity Value for Term Deposit Account "+A);
			break;
		case 'b':
		case 'B':
			System.out.println("Enter principal amount");
			p=sc.nextDouble();
			System.out.println("Enter rate of interest");
			r=sc.nextDouble();
			System.out.println("Ente rthe time period in months");
			n=sc.nextInt();
			A=p*n+(p*((n*(n+1))/2.0)*(r/100.0)*(1.0/12.0));
			System.out.println("Maturity Value for Recurring Deposit Account"+A);
			break;
			default:
				System.out.println("Wring Choice!");
		}//end switch
		sc.close();
	}
}
