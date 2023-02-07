package Class10.APC_Array_prog;
import java.util.*;
public class binery_Ser_2022_Q2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int A[]= {2,5,7,10,15,20,29,30,46,50};
		System.out.println("Enter the array element to be searched: ");
		int n=sc.nextInt();
		int mid=0,ub=0,lb=0,flag=0;
			while(lb<=ub)
			{
				mid=(ub+lb)/2;
				if(n<A[mid])
				ub=mid-1;
				else if(n>A[mid])
				lb=mid+1;
				else if(n==A[mid]) 
				{
					flag=1;
					break;
				}
			}
			if(flag>0)
			System.out.println("Array element found in"+mid+"th position of array");
			else
			System.out.println("Array element not found");
			sc.close();
		
	}//PROGRAM HAS BUG.BUG HAS TO BE REMOVED.

}
