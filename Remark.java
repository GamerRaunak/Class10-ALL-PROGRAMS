package Class10.APC_Array_prog;
import java.util.*;
public class Remark 
{
	public static void main(String []args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter number of students");
			int n=sc.nextInt();
			int rollno[]=new int[n];
			String nm[]=new String[n];
			int mk1[]=new int[n];
			int mk2[]=new int[n];
			int mk3[]=new int[n];
			int i;
			double avg=0.0d;
			System.out.println("Enter names of students");
			for(i=0;i<n;i++)
				nm[i]=sc.next();
			System.out.println("Enter roll no. of students");
			for(i=0;i<n;i++)
				rollno[i]=sc.nextInt();
			System.out.println("Enter marks of first subject of students");
			for(i=0;i<n;i++)
				mk1[i]=sc.nextInt();
			System.out.println("Enter marks of second subject of students");
			for(i=0;i<n;i++)
				mk2[i]=sc.nextInt();
			System.out.println("Enter marks of third subject of students");
			for(i=0;i<n;i++)
				mk3[i]=sc.nextInt();
			for(i=0;i<n;i++)
			{
				avg=(double)(mk1[i]+mk2[i]+mk3[i])/3.0;
				if(avg>=85 && avg<=100)
					System.out.println(nm[i]+"--EXCELLENT");
				else if(avg>=75 && avg<85)
					System.out.println(nm[i]+"--DISTINCTION");
				else if(avg>=60 && avg<75)
					System.out.println(nm[i]+"--FIRST CLASS");
				else if(avg>=40 && avg<60)
					System.out.println(nm[i]+"--PASS");
				else
					System.out.println(nm[i]+"--POOR");
			}
			
		}
	}

}
