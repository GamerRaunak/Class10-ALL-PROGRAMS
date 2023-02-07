package Class10.anonymous;
import java.util.*;
public class avg_marks
{
	public static void main(String args[])
	{
		int sum=0;double avg=0.0d,dev=0.0d;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of students: ");
		int n=sc.nextInt();
		String name[]=new String[n];
		int totalmarks[]=new int[n];
		
		System.out.println("Enter the names of students: ");
		for(int i=0;i<n;i++)
			name[i]=sc.next();
		
		System.out.println("Enter the marks of students: ");
		for(int i=0;i<n;i++)
			totalmarks[i]=sc.nextInt();
		
		for(int i=0;i<n;i++)
			sum+=totalmarks[i];
		
		avg=sum/n;
		//Calculate Deviation
		System.out.println("Deviation of each student is: ");
		for(int i=0;i<n;i++)
		{
			dev=totalmarks[i]-avg;
			System.out.println(dev);
		}
			
		System.out.println("Average of total marks obtained by "+n+" students is: "+avg);
		sc.close();
	}//end main()
}//end class()
