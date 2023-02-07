package Class10.APC_Array_prog;
import java.util.*;
public class Seven_wonders 
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String A[]= {"CHICHENITZA","CHRISTTHE REDMEEMER","TAJMAHAL","GREAT WALL OF CHINA","MACHU PICCHU","PETRA","COLOSSEUM"};
			String B[]= {"MEXICO","BRAZIL","INDIA","CHINA","PERU","JORDAN","ITALY"};
			System.out.println("Enter country name: ");
			String s=sc.next();
			int i,f=0;
			for(i=0;i<7;i++)
			{
				if(s.equals(B[i])) {
					f=1;
					break;
				}
			}
			if(f==1)
			System.out.println(B[i]+"--"+A[i]);
			else
				System.out.println("Sorry Not Found!");
				sc.close();
		}
	}
}
