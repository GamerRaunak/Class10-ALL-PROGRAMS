package Class10.Loops_APC;

public class inverterLeftTri
{
	public static void main(String[] args)
	{
for (int i = 0; i < 5; i++) {
            
            for (int j = i; j > 0; j--) {
                System.out.print("  ");
            }
            
            for (int k = 5 - i; k > 0; k--) {
                //System.out.print((5 - i) + " ");
            	System.out.print(k + " ");
            }
            
            System.out.println();
        }
	}
}
