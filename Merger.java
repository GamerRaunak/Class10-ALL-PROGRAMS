package Abhishek_Sirs_unsolved_paper;
import java.util.*;
public class Merger
{
	public static void main(String[] args)
	{
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter the size of array1 :");
			int n=in.nextInt();
			System.out.println("Enter the size of array2 :");
			int m=in.nextInt();
			int A[]=new int[n];
			int B[]=new int[m];
			int C[]=new int[n+m];
			int i,k;
			System.out.println("Enter the elements in array1 :");
			for(i=0;i<n;i++)
				A[i]=in.nextInt();
			System.out.println("Enter the elements in array2 :");
			for(i=0;i<m;i++)
				B[i]=in.nextInt();
			System.out.println("Elements in array1 :");
			for(i=0;i<n;i++)
				System.out.print(A[i]+" ");
			System.out.println("\nElements in array2 :");
			for(i=0;i<B.length;i++)
				System.out.print(B[i]+" ");
			//Merging
			for(i=0;i<A.length;i++)
				C[i]=A[i];//Copy array A[] in C[]
			for(i=n,k=0;i<C.length;i++,k++)
				C[i]=B[k];//put consequent elements of B[] in C[] after elements of A[]
			System.out.println("\nMerged array: ");
			for(i=0;i<C.length;i++)
				System.out.println(C[i]+" ");
				in.close();
		}
	}//end of main()
}//end of class
