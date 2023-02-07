package Class10.anonymous;
import java.util.*;
public class firstArray
{
	public static void main(String args[])
	{
		int Marks[]=new int[20];//made an array with storage 20
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<20;i++)
		{
			System.out.println("Enter marks");
			Marks[i]=sc.nextInt();//stores marks of each student in each memory block
		}
		long sum=0l;
		double classAvg=0.0d;
		for(int i=0;i<20;i++)
		{
			sum+=Marks[i];//sum of all 20 marks
		}
		classAvg=sum/20;
		System.out.println("Maths marks of 20 students are shown below: ");
		for(int i=0;i<20;i++)
		{
			System.out.println(Marks[i]);
		}
		System.out.println("Class average of Mathematics marks is: "+classAvg);
		sc.close();
	}//end main()
}//end class
