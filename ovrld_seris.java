package Abhishek_Sirs_unsolved_paper;
import java.util.*;
public class ovrld_seris
{
	boolean isPrime(int a)
	{
		int c=0;
		if(a<=1)
			return false;
		else {
			for(int i=2;i<a;i++)
			{
				if(a%i==0)
					c=c+1;
			}
		if(c==0)
			return true;
		else
			return false;
		}
	}//end of isPrime()
	void series(int n)
	{
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(isPrime(i)==true)
				sum+=i;
		}
		System.out.println("Sum of "+n+" prime numbers is: "+sum);
	}//end of series(int n)
	void series()
	{
		int a=5,b=10;
		System.out.print(a+" "+b);
		int c=0;
		for(int i=0;i<10;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}//end of series()
	void series(int x,int n)
	{
		double sum=0.0d;
		for(int i=0,k=1;i<n;k+=2,i++)
		{
			if(i%2==0)
				sum-=Math.pow(x, k);
			else
				sum+=Math.pow(x, k);
		}
		System.out.println("Sum of given series is: "+sum);
	}//end of series(int x,int n)
	public static void main(String[] args)
	{
		ovrld_seris obj=new ovrld_seris();
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter 1 to display sum of n prime numbers.");
		System.out.println("Enter 2 to display given Fibonacci series.");
		System.out.println("Enter 3 to display sum of given series.");
		System.out.println("Enter 4 to Exit.");
		int ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			System.out.println("Enter the number of prime numbers whose sum is to be displayed.");
			int n=sc.nextInt();
			obj.series(n);
			break;
		case 2:
			obj.series();
			break;
		case 3:
			System.out.println("Enter x: ");
			int x=sc.nextInt();
			System.out.println("Enter the number of terms n of the series");
			n=sc.nextInt();
			obj.series(x, n);
			break;
		case 4:
			System.exit(0);
			break;
			default:System.out.println("Wrong choice entered.");
		}//end switch-case
		sc.close();
	}//end main()
}//end class
