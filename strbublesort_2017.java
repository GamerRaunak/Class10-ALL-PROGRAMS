package Class10.APC_Array_prog;
import java.util.*;
public class strbublesort_2017
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			String A[]=new String[5];
			int i,j;String tmp;
			System.out.println("Enter the array elements: ");
			for(i=0;i<5;i++)
			{
				A[i]=sc.next();
			}
			sc.close();
			for(i=0;i<5;i++)
			{
				for(j=0;j<4-i;j++)
				{
					if(A[j].compareTo(A[j+1])<0)
					{
						tmp=A[j]; 
						A[j]=A[j+1];
						A[j+1]=tmp;
					}
				}
			}
			System.out.println("Sorted Array: ");
			for(i=0;i<5;i++)
			{
				System.out.println(A[i]);
			}
		}

	}

}//74
//82
