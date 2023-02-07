/*Define a class called ParkingLot with the following description:

Data Members        Purpose
int vno	            To store the vehicle number
int hours	        To store the number of hours the vehicle is parked in the parking lot
double bill	        To store the bill amount

Member Methods	    Purpose
void input( )	    To input the vno and hours
void calculate( )	To compute the parking charge at the rate ₹3 for the first hour or the part thereof and ₹1.50 for each additional hour or part thereof.
void display()	    To display the detail

Write a main method to create an object of the class and call the above methods.*/ 
package Class10.anonymous;

import java.util.*;
class ParkingLot
{
    int vno,hours;
    double bill;

    void input()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle number: ");
        vno=sc.nextInt();
        System.out.println("Enter the number of hours vehicle is parked in parking lot: ");
        hours=sc.nextInt();
        sc.close();
    }//end of input()
    void calculate()
    {
        if(hours<=1)
        bill=3;
        else
        bill=3+(hours-1)*1.5;
    }//end of calculate()
    void display()
    {
        System.out.println("Vehicle number: "+vno);
        System.out.println("No. of hours vehicle parked in parking-lot: "+hours);
        System.out.println("Amounted Bill: "+bill);
    }//end of display()

    public static void main(String []args)
    {
        ParkingLot obj=new ParkingLot();
        obj.input();
        obj.calculate();
        obj.display();
    }//end of main()
}//end of class

//NO BUGS