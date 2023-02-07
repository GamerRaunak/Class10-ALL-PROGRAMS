package Class10.anonymous;

import java.util.*;
public class NivenNumber {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num=sc.nextInt();
		int z=0,p=num,sum=0;;
		while(num>0)
		{
			z=num%10;
			sum+=z;
			num=num/10;
		}//end while
		if(p%sum==0)
			System.out.println("Niven Number");
		else
			System.out.println("Not a Niven Number");
		
		sc.close();
	}//end main()
}//end class
