package Class10.anonymous;
import java.util.*;
public class Program
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r,i,j,s=1;
        System.out.println("Enter the character to be displayed in pattern ");
        char a=sc.next().charAt(0);
        System.out.println("Enter no. of rows ");
        r=sc.nextInt();
        s=r-1;
        for(j=1;j<=r;j++)
        {
            for(i=1;i<=s;i++)
            {
                System.out.print(" ");
            }
            s--;
            for(i=1;i<=2*j-1;i++)
            {
                System.out.print(a);
            }
            System.out.println("");
        }
        s=1;
        for(j=1;j<=r;j++)
        {
            for(i=1;i<=s;i++)
            {
                System.out.print(" ");
            }
            s++;
            for(i=1;i<=2*(r-j)-1;i++)
            {
                System.out.print(a);
            }
            System.out.println("");
            sc.close();
        }
    }
}