/*Using switch statement, write a menu driven program to:

(a) find and display all the factors of a number input by the user ( including 1 and the excluding the number itself).

Example:

Sample Input : n = 15
Sample Output : 1, 3, 5

(b) find and display the factorial of a number input by the user (the factorial of a non-negative integer n, denoted by n!,
is the product of all integers less than or equal to n.)

Example:

Sample Input : n = 5
Sample Output : 5! = 1*2*3*4*5 = 120

For an incorrect choice, an appropriate error message should be displayed.*/ 
package Class10.anonymous;
import java.util.*;
public class PracticePaper_Q9
{
    public static void main(String []args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 'a' to display all the factors of a number");
        System.out.println("Enter 'b' to display the factorial of a number");
        char ch=sc.next().charAt(0);
        switch(ch)
        {
            case 'a':
            //case 'A':
            System.out.print("Enter the number: ");
            int n=sc.nextInt();
            for(int i=1;i<n;i++)
            {
                if(n%i==0 && i!=n)
                System.out.print(i+" ");
            }
            break;

            case 'b':
            //case 'B':
            System.out.print("Enter the number: ");
            n=sc.nextInt();
            int f=1;
            for(int i=1;i<=n;i++)
            f*=i;
            System.out.println(f);
            break;
            default:
            System.out.println("WRONG CHOICE ENTERED");
            sc.close();
        }//end of switch
    }//end of main()
}//end of class
