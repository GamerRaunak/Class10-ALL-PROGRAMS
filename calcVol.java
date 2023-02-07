package Class10.anonymous;
import java.util.*;
public class calcVol
{
	double volc,vols;
	double volume(int s)
	{
		volc=s*s*s;
		return volc;
	}
	double volume(double r)
	{
		vols=(4/3)*3.14*r;
		return vols;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		calcVol obj=new calcVol();
		System.out.println("TO FIND VOLUME OF CUBE:- ");
		System.out.println("Enter side of cube: ");
		int side=sc.nextInt();
		System.out.println("Volume of cube: "+obj.volume(side));
		
		System.out.println("TO FIND VOLUME OF SPHERE:- ");
		System.out.println("Enter radius of sphere: ");
		double radius=sc.nextDouble();
		System.out.println("Volume of cube: "+obj.volume(radius));
		sc.close();
	}//end of main
}//end of class
