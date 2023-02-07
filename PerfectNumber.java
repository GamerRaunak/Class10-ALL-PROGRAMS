package Class10.anonymous;
import java.util.*;
public class PerfectNumber {
	public static void main(String []args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number");
    int num1=sc.nextInt();
    int sum=1;				// sum will store the sum of proper divisors
    						// As 1 is a proper divisor for all numbers
    					// Initialized sum with 1
    for(int i=2;i<num1;i++)// Looping through the numbers to check if they are
                            // divisors or not
    {
        if(num1 % i == 0)
        sum=sum+i;
    }// If sum of divisors is equal to
// n, then n is a perfect number
    if(sum==num1)
        System.out.println("It is a Perfect number");
        else
        System.out.println("It is not a Perfect number");
    sc.close();
	}
}
