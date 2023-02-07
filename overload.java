package Class10.anonymous;
public class overload
{
	void num_cal(int num,char ch)
	{
		
		if(ch=='s')
			System.out.println("The square of the two numbers is: "+((int)Math.pow(num, 2)));
		else
			System.out.println("The cube of the two numbers is: "+((int)Math.pow(num, 3)));
	}
	void num_cal(int a,int b,char ch)
	{
		if(ch=='p')
			System.out.println("The product of the two numbers is: "+(a*b));
		else
			System.out.println("The sum of the two numbers is: "+(a+b));
	}
	void num_cal(String sr1,String sr2)
	{
		if(sr1.equals(sr2))
			System.out.println("The two strings are equal");
		else
			System.out.println("The two strings are not equal");
	}
	public static void main(String []args)
	{
		overload obj=new overload();
		obj.num_cal(5,'s');
		obj.num_cal(5,7,'p');
		obj.num_cal("virus","virus");
	}
}
