package Class10.anonymous;
import java.util.*;
public class DuckNumber
{
    public static void main(String args[])
    {
        int z,count=0;//,count2=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the integer: ");
        int n=sc.nextInt();
        while (n!=0)
        {
            z=n%10;
            n=n/10;
            if(z==0)
            {
                count++;
                break;
            }
        }
        if(count>0)
        System.out.println("The interger is a DUCK Number");
        else
        System.out.println("The interger is not a DUCK Number");
        sc.close();
    }//end of main()
}//end of class