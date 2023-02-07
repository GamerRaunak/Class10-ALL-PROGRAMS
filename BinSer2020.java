package Class10.APC_Array_prog;
import java.util.*;
public class BinSer2020
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter thye element to be searched");
		int s=sc.nextInt();
		int A[]={31,36,45,50,60,75,86,90};
		int mid=0,lb=0,ub=7,flag=0;
		while(lb<=ub)
		{
			mid=(lb+ub)/2;
			if(A[mid]>s)
			ub=mid-1;
			else if(A[mid]<s)
			lb=mid+1;
			else {
			flag=1;
			break;
			}
		}
		if(flag==1)
			System.out.println("Search Successful");
		else
			System.out.println("Search Unsuccessful");
		sc.close();
	}
}
