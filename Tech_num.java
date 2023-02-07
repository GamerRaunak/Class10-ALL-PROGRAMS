package Abhishek_Sirs_unsolved_paper;

public class Tech_num
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int fh=0,lh=0;
		for(int i=1000;i<=9999;i++)
		{
				fh=i/100;
				lh=i%100;
				if((int)Math.pow((fh+lh),2)==i)
					System.out.println(i);
		}
		
	}
}
