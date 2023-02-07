package Class10.APC_Array_prog;
import java.util.*;
public class sortbuble2017 
{
	public static void main(String[] args)
	{
		try (Scanner sc = new Scanner(System.in)) {
			int A[]=new int[20];
			int i,j,m,sum = 0;
			System.out.println("Enter the array elements: ");
			for(i=0;i<20;i++)
			{
				A[i]=sc.nextInt();
				sum+=A[i];
			}for(i=0;i<20;i++) {
				for(j=0;j<19-i;j++)
				{
					if(A[j]>A[j+1]) 
					{
						m=A[j];
						A[j]=A[j+1];
						A[j+1]=m;
					}
				}
			}
			//for(i=0;i<20;i++)
				//System.out.println(A[i]);
				
				
			
			System.out.println("Biggest element = "+A[19]);
			System.out.println("Smallest element = "+A[0]);
			System.out.println("Total = "+sum);
			sc.close();
		}
	}

}
