package Class10.anonymous;
import java.util.*;
public class Performance
{
	String name;
	double english;
	double maths;
	double science;
	double history;
	double geography;
	double percent;
	Performance(String nm,double eng,double mat,double sci,double his,double geo)
	{
		name=nm;
		english=eng;
		maths=mat;
		science=sci;
		history=his;
		geography=geo;
		percent=0.0d;
	}
	void findPercent()
	{
		percent=((english+maths+science+history+geography)/500)*100;
	}
	void display()
	{
		System.out.println("Name of student: "+name);
		System.out.println("Marks scored in english: "+english);
		System.out.println("Marks scored in maths: "+maths);
		System.out.println("Marks scored in science: "+science);
		System.out.println("Marks scored in history: "+history);
		System.out.println("Marks scored in geography: "+geography);
		System.out.println("Overall Percentage: "+percent);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name of student: ");
		String nm=sc.nextLine();
		System.out.println("Enter marks scored in english:");
		double eng=sc.nextDouble();
		System.out.println("Enter marks scored in maths:");
		double mat=sc.nextDouble();
		System.out.println("Enter marks scored in science:");
		double sci=sc.nextDouble();
		System.out.println("Enter marks scored in history:");
		double his=sc.nextDouble();
		System.out.println("Enter marks scored in geography:");
		double geo=sc.nextDouble();
		Performance stud=new Performance(nm,eng,mat,sci,his,geo);
		stud.findPercent();
		stud.display();
		sc.close();
	}//end of main()
}//end of class
