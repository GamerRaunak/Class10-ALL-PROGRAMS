package Abhishek_Sirs_unsolved_paper;
import java.util.*;
class Number
{
	int n;
	Number(int nm)
	{
		n=nm;
	}
	boolean check(int num)
	{
		int ncpy=num,c=0;
		while(ncpy!=0)
		{
			ncpy=ncpy/10;
			++c;
		}
		int sq_num=num*num;
		if(sq_num%Math.pow(10,c)==num)
			return true;
		else 
			return false;
	}
	void print()
	{
		if(check(n)==true)
			System.out.println("Tech Number");
		else
			System.out.println("Not a Tech Number");
	}
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number to check if it is a Tech Number or not.");
		int number=sc.nextInt();
		Number obj=new Number(number);
		obj.print();
		sc.close();
	}//end main
}//end class
